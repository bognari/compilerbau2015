package testing;

import beaver.Parser;
import org.junit.Test;

import java.io.IOException;

public class SPigletTest {
	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testBaseProgram() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBaseProgram(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testFactorial() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testFactorial(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testMath() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMath(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testSum() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testSum(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testBinTree() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBinTree(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testMultipleClassDecls() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMultipleClassDecls(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testArray() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArray(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testOO() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOO(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testOOSimple() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testOOSimple(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Spiglet_testChainedCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testChainedCall(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
    }
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Spiglet_testCallInCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testCallInCall(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
    }

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testCallChain() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testCallChain(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testAllocTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAllocTest(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testAndTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testAndTest(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testBubbleSortTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testBubbleSortTest(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testExtendsTest() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testExtendsTest(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testLinearSearch() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinearSearch(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testLinkedList() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testLinkedList(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testMoreThan4() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testMoreThan4(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testQuickSort() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testQuickSort(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testTreeVisitor() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testTreeVisitor(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}

	@Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testManyVars() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testManyVars(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testNPEObject() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testNPEObject(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testArrayOOB() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayOOB(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testArrayNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayNPE(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Spiglet_testArrayLengthNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayLengthNPE(TestHelper::buildSpiglet, TestHelper::runPigletInterpreter);
	}
}
