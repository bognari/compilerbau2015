package minijava;

import kanga.KangaParser;
import kanga.KangaScanner;
import piglet.PigletParser;
import piglet.PigletScanner;
import spiglet.SPigletParser;
import spiglet.SPigletScanner;

import java.io.*;
import java.util.Set;

public class MJFrontEnd {
    
    static class Options {
        boolean printPiglet, printSpiglet, printKanga;
        String filename, pgfilename, spgfilename, kangafilename, mipsfilename;
        public void parse(String args[]) {
            for (int i = 0 ; i < args.length ; i++) {
                final String arg = args[i];
                if (arg.startsWith("-")) {
                    switch (arg) {
                    case "--output-piglet":
                        printPiglet = true;
                        if (++i < args.length) {
                            pgfilename = args[i];
                        }
                        break;
                    case "--output-spiglet":
                        printSpiglet = true;
                        if (++i < args.length) {
                            spgfilename = args[i];
                        }
                        break;
                    case "--output-kanga":
                        printKanga = true;
                        if (++i < args.length) {
                            kangafilename = args[i];
                        }
                        break;
                    case "--output":
                        if (++i < args.length) {
                            mipsfilename = args[i];
                        } else {
                            throw new IllegalArgumentException("no filename supplied for --output");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("unrecognized option");
                    }
                } else {
                    if (filename == null) {
                        filename = arg;
                    } else {
                        throw new IllegalArgumentException(
                                "Multiple files currently not supported");
                    }
                }
            }
        }
    }
    
    private static void outputCode(String filename, String code) {
        if (filename.equals("-")) {
            System.out.println(code);
        } else {
            try (PrintWriter fout = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(filename)))) {
                fout.println(code);
            } catch (IOException ex) {
                System.err.printf("Cannot write IR code to %s: %s",
                        filename, ex.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        Options opt = new Options();
        try {
            opt.parse(args);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
            return;
        }
        if (opt.filename == null) {
            System.err.println("missing file command line argument");
            System.exit(1);
            return;
        } else {
            // don't let them run into an exception for this common case
            if (!new File(opt.filename).exists()) {
                System.err.println("file does not exist");
                System.exit(1);
            }            
            System.out.println("compiling " + opt.filename);
            System.out.flush();
        }        
        try {
            // Start parsing
            MJParser parser = new MJParser();
            minijava.Program ast = (minijava.Program) parser.parse(new MJScanner(new FileReader(opt.filename)));

            Set<NameError> nameErrors = ast.getNameErrors();
            if (!nameErrors.isEmpty()) {
                System.out.println("There are " + nameErrors.size() + " name error(s) in " + opt.filename);
                for (NameError e : nameErrors) {
                    System.out.println(e.getMessage());
                }
                System.exit(1);
            }
            
            Set<TypeError> typeErrors = ast.getTypeErrors();
            if (!typeErrors.isEmpty()) {
                System.out.println("There are " + typeErrors.size() + " type error(s) in " + opt.filename);
                for (TypeError e : typeErrors) {
                    System.out.println(e.getMessage());
                }
                System.exit(1);
            }
            
            final String pigletCode = ast.printPiglet().toString();

            PigletParser pparser = new PigletParser();
            piglet.Program pigprog = (piglet.Program) pparser.parse(new PigletScanner(new StringReader(pigletCode)));
            if (opt.printPiglet) {
                if (opt.pgfilename == null) {
                    System.err.println("Expected filename for piglet IR output");
                    System.exit(1);
                }
                outputCode(opt.pgfilename, pigprog.print().getString());
            }
            
            final String spigletCode = pigprog.printSpiglet().toString();

            SPigletParser sparser = new SPigletParser();
            spiglet.Program spigprog = (spiglet.Program) sparser.parse(new SPigletScanner(new StringReader(spigletCode)));
            if (opt.printSpiglet) {
                if (opt.spgfilename == null) {
                    System.err.println("Expected filename for spiglet IR output");
                    System.exit(1);
                }
                outputCode(opt.spgfilename, spigprog.print().getString());
            }
            
            final String kangaCode = spigprog.printKanga().toString();

            KangaParser kparser = new KangaParser();
            kanga.Program kprog = (kanga.Program) kparser.parse(new KangaScanner(new StringReader(kangaCode)));
            if (opt.printKanga) {
                if (opt.kangafilename == null) {
                    System.err.println("Expected filename for kanga IR output");
                    System.exit(1);
                }
                outputCode(opt.kangafilename, kprog.print().getString());
            }
            
            if (opt.mipsfilename == null) {
                System.out.println(kprog.printMIPS().toString());
            } else {
                outputCode(opt.mipsfilename, kprog.printMIPS().toString());
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("file " + opt.filename + " not found");
            System.exit(1);
        } catch (beaver.Parser.Exception e) {
            System.err.println("Parse error: " + opt.filename);
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("IO exception: " + e.getMessage());
            System.exit(1);
        }
    }

}
