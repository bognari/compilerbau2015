package testing;

import beaver.Parser.Exception;
import minijava.Program;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MiniJavaTest {
    
    private final static String PATH = "tests/semantic_analysis";
	
	public int numOfError(minijava.Program p){
		return p.getNameErrors().size() + p.getTypeErrors().size();
	}

	public Program buildTest(File appendCode) throws IOException, Exception{
		return TestHelper.buildMiniJavaProgram(appendCode);
	}

	public String getErrors(minijava.Program program) {
		final StringBuilder stringBuilder = new StringBuilder();
		for (minijava.NameError nameError : program.getNameErrors()) {
			stringBuilder.append(nameError.getMessage());
			stringBuilder.append("\n");
		}
		for (minijava.TypeError typeError : program.getTypeErrors()) {
			stringBuilder.append(typeError.getMessage());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}

	@Test
	public void MiniJava_testNoError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "allRight.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}

	@Test
	public void MiniJava_testSysoOk() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "sysoWorking.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}

	@Test
	public void MiniJava_testSysoError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "sysoError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}

	@Test
	public void MiniJava_testMissingType() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "missingType.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testIfNoError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "ifWorking.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testIfError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "ifError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testWhileNoError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "whileWorking.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testWhileError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "whileError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testArrayZugriffOk() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "arrayOk.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testFalscherArrayZugriffPos() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "arrayPos.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testFalscherArrayZugriffWert() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "arrayWert.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testFalscherArrayZugriffArray() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "arrayArray.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testGueltigerMethodenAufrufInt() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeInt.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testUnGueltigerMethodenAufrufIntParam() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeIntErrorParam.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testUnGueltigerMethodenAufrufIntWert() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeIntErrorReturn.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testMethodenReturnError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "returnError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testMethodeVererbung() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeVererbung.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testMethodeParameterVererbung() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeParameterVererbung.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testMethodeParameterVererbungError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeParameterVererbungError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testMethodeUneindeutig() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "methodeUneindeutig.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testConstructor() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "constructor.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testConstructorError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "constructorError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
	
	@Test
	public void MiniJava_testBooleanLit() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "booleanLit.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testThisWorking() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "this.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testThisVererbung() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "thisVererbung.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
	
	@Test
	public void MiniJava_testThisError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "thisError.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testDuplicatNameClass() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "duplicatNameClass.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableMain() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_main.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableMethod() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_method.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariables() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variables.txt"));
		assertEquals(getErrors(p), 2, numOfError(p));
	}

    @Test
	public void MiniJava_testUninitializedVariableNoUse() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_nouse.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableIfOk() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_if_ok.txt"));
		assertEquals(getErrors(p), 0, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableIfError() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_if_error.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableIfCondition() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_if_condition.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
    
    @Test
	public void MiniJava_testUninitializedVariableWhile() throws IOException, Exception {
		Program p = buildTest(new File(PATH, "uninitialized_variable_while.txt"));
		assertEquals(getErrors(p), 1, numOfError(p));
	}
}
