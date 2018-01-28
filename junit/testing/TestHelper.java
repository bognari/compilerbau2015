package testing;

import beaver.Parser.Exception;
import kanga.KangaParser;
import kanga.KangaScanner;
import minijava.MJParser;
import minijava.MJScanner;
import org.junit.Assert;
import piglet.PigletParser;
import piglet.PigletScanner;
import spiglet.SPigletParser;
import spiglet.SPigletScanner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestHelper {

    private static final String PIGLET_INTERPRETER = "support/pgi.jar";
    private static final String KANGA_INTERPRETER = "support/kgi.jar";
    private static final String MIPS_INTERPRETER = "support/spim";

    public static minijava.Program buildMiniJavaProgram(File f) throws IOException, Exception {
        MJParser parser = new MJParser();
        return (minijava.Program) parser.parse(new MJScanner(new FileInputStream(f)));
    }

    private static piglet.Program buildPigletProgram(File f) throws IOException, Exception {
        final minijava.Program p = buildMiniJavaProgram(f);
        final String pigletCode = p.printPiglet().toString();

		PigletParser parser = new PigletParser();
		piglet.Program ast = (piglet.Program) parser.parse(new PigletScanner(new StringReader(pigletCode)));

		return ast;
    }
    
    public static String buildPiglet(File f) throws IOException, Exception {
        return buildPigletProgram(f).print().getString();
    }

    private static spiglet.Program buildSpigletProgram(File f) throws IOException, Exception {
        final piglet.Program p = buildPigletProgram(f);
        final String spigletCode = p.printSpiglet().toString();

		SPigletParser parser = new SPigletParser();
		spiglet.Program ast = (spiglet.Program) parser.parse(new SPigletScanner(new StringReader(spigletCode)));

		return ast;
    }
    
    public static String buildSpiglet(File f) throws IOException, Exception {
        return buildSpigletProgram(f).print().getString();
    }

    private static kanga.Program buildKangaProgram(File f) throws IOException, Exception {
        final spiglet.Program p = buildSpigletProgram(f);
        final String kangaCode = p.printKanga().toString();

		KangaParser parser = new KangaParser();
		kanga.Program ast = (kanga.Program) parser.parse(new KangaScanner(new StringReader(kangaCode)));

		return ast;
    }
    
    public static String buildKanga(File f) throws IOException, Exception {
        return buildKangaProgram(f).print().getString();
    }
    
    public static String buildMIPS(File f) throws IOException, Exception {
        return buildKangaProgram(f).printMIPS().toString();
    }
    
    public static List<String> runInterpreter(String interpreter, String code) throws IOException, InterruptedException {
        // We must spawn a process, because the interpreter can fuck up the test with System.exit(1)        
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec("java -jar "+interpreter);
       
        final InputStream capture = proc.getInputStream();
        
        try (PrintStream input = new PrintStream(proc.getOutputStream())) {
            input.println(code);
        }
        
        final int exitCode = proc.waitFor();

        List<String> result = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(capture))) {
            in.lines().forEach(result::add);
        }
        
        if (exitCode != 0 && !(result.size() == 1 && result.get(0).equals("ERROR"))) {
            Assert.fail("Interpreter terminated with error.");
        }
        
        return result;
    }

    public static List<String> runPigletInterpreter(String code) throws IOException, InterruptedException {
        return runInterpreter(PIGLET_INTERPRETER, code);
    }

    public static List<String> runKangaInterpreter(String code) throws IOException, InterruptedException {
        return runInterpreter(KANGA_INTERPRETER, code);
    }
    
    public static List<String> runMIPSInterpreter(String code) throws IOException, InterruptedException {
        
        final String exceptionFile = "support/exceptions.s";
        
        final Path tmpFile = Files.createTempFile("mips_unittest_", ".s");
        Files.write(tmpFile, code.getBytes("US-ASCII"));
        tmpFile.toFile().deleteOnExit();
        
        Runtime rt = Runtime.getRuntime();
        Process proc;
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            // use global installation on mac
            String cmd = String.format("spim -exception_file %s -file %s", exceptionFile, tmpFile.toString());
            proc = rt.exec(cmd);
        } else {
            proc = rt.exec(new String[]{
                MIPS_INTERPRETER,
                "-exception_file",
                exceptionFile,
                "-file",
                tmpFile.toString()
            });
        }

        final InputStream capture = proc.getInputStream();
        
        // careful - this fucking bitch does also exit with code 0 in case of an error
        if (proc.waitFor() != 0) {
            throw new InterruptedException("Interpreter terminated with error.");
        }

        List<String> result = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(capture))) {
            in.lines().forEach(result::add);
        }
        
        // remove module load messages
        while (!result.isEmpty() && result.get(0).startsWith("Loaded:")) {
            result.remove(0);
        }

        return result;
    }
}
