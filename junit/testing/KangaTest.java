package testing;

import beaver.Parser;
import org.junit.Test;

import java.io.IOException;

public class KangaTest {
    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testBaseProgram() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBaseProgram(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testFactorial() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testFactorial(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testMath() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMath(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testSum() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testSum(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testBinTree() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBinTree(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testMultipleClassDecls() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMultipleClassDecls(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testArray() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testArray(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testOO() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testOO(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testOOSimple() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testOOSimple(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testChainedCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testChainedCall(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testCallInCall() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testCallInCall(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testCallChain() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testCallChain(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testAllocTest() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testAllocTest(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testAndTest() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testAndTest(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testBubbleSortTest() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testBubbleSortTest(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testExtendsTest() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testExtendsTest(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testLinearSearch() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testLinearSearch(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testLinkedList() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testLinkedList(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testMoreThan4() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testMoreThan4(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testQuickSort() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testQuickSort(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testTreeVisitor() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testTreeVisitor(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }

    @Test(timeout = AllTests.TEST_TIMEOUT)
    public void Kanga_testManyVars() throws IOException, InterruptedException, Parser.Exception {
        AllTests.testManyVars(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
    }
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Kanga_testNPEObject() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testNPEObject(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Kanga_testArrayOOB() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayOOB(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Kanga_testArrayNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayNPE(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
	}
    
    @Test(timeout = AllTests.TEST_TIMEOUT)
	public void Kanga_testArrayLengthNPE() throws IOException, InterruptedException, Parser.Exception {
		AllTests.testArrayLengthNPE(TestHelper::buildKanga, TestHelper::runKangaInterpreter);
	}
}
