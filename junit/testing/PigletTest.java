package testing;

import beaver.Parser;
import org.junit.Test;

import java.io.IOException;

public class PigletTest {

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testBaseProgram() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBaseProgram(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testFactorial() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testFactorial(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testMath() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMath(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testSum() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testSum(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testBinTree() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBinTree(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testMultipleClassDecls() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMultipleClassDecls(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testArray() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArray(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testOO() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOO(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testOOSimple() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOOSimple(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Piglet_testChainedCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testChainedCall(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
    }
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Piglet_testCallInCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testCallInCall(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
    }

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testCallChain() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testCallChain(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testAllocTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAllocTest(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testAndTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAndTest(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testBubbleSortTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testBubbleSortTest(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testExtendsTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testExtendsTest(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testLinearSearch() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinearSearch(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testLinkedList() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinkedList(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testMoreThan4() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMoreThan4(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testQuickSort() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testQuickSort(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testTreeVisitor() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testTreeVisitor(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testManyVars() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testManyVars(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testNPEObject() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testNPEObject(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testArrayOOB() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayOOB(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testArrayNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayNPE(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Piglet_testArrayLengthNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayLengthNPE(TestHelper::buildPiglet, TestHelper::runPigletInterpreter);
	}
}
