package testing;

import beaver.Parser;
import org.junit.Test;

import java.io.IOException;

public class MIPSTest {
	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testBaseProgram() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBaseProgram(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testFactorial() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testFactorial(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testMath() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMath(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testSum() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testSum(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testBinTree() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBinTree(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testMultipleClassDecls() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMultipleClassDecls(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testArray() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArray(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testOO() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOO(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testOOSimple() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOOSimple(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void MIPS_testChainedCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testChainedCall(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
    }
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void MIPS_testCallInCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testCallInCall(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
    }

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testCallChain() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testCallChain(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testAllocTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAllocTest(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testAndTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAndTest(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testBubbleSortTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testBubbleSortTest(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testExtendsTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testExtendsTest(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testLinearSearch() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinearSearch(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testLinkedList() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinkedList(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testMoreThan4() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMoreThan4(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testQuickSort() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testQuickSort(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testTreeVisitor() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testTreeVisitor(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testManyVars() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testManyVars(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testNPEObject() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testNPEObject(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testArrayOOB() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayOOB(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testArrayNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayNPE(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void MIPS_testArrayLengthNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayLengthNPE(TestHelper::buildMIPS, TestHelper::runMIPSInterpreter);
	}
}
