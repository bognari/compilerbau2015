package testing;

import beaver.Parser;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@SuiteClasses({
	MiniJavaTest.class,
	PigletTest.class,
	SPigletTest.class,
    KangaTest.class,
    MIPSTest.class
})
public class AllTests {
    
    public static final int TEST_TIMEOUT = 2000;

    @FunctionalInterface
    public static interface ProgramBuilder {
        String apply(File f) throws IOException, Parser.Exception, InterruptedException;
    }
    
    @FunctionalInterface
    public static interface ProgramInterpreter {
        List<String> apply(String s) throws IOException, InterruptedException;
    }
    
    private static List<String> getOutput(ProgramBuilder builder,
            ProgramInterpreter interpreter, String filename) throws IOException, InterruptedException, Parser.Exception {
        return interpreter.apply(builder.apply(new File(filename)));
    }
    
    private static void verifyResults(List<String> actual, int ... expected) {
        assertEquals("output length", expected.length, actual.size());
        for (int i = 0 ; i < expected.length ; i++) {
            assertEquals("output " + i, String.valueOf(expected[i]), actual.get(i));
        }
    }
    
    private static void verifyError(List<String> actual) {
        assertEquals("output length", 1, actual.size());
        assertEquals("expected error ", "ERROR", actual.get(0));
    }
    
	public static void testBaseProgram(ProgramBuilder builder,
            ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/MainTestForPiglet.java"),
            15, 15, 15, 13, 0
        );
	}

	public static void testFactorial(ProgramBuilder builder,
            ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/Factorial.java"),
            3628800,
            120
        );
	}

	public static void testMath(ProgramBuilder builder,
            ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
		verifyResults(
            getOutput(builder, interpreter, "tests/MathTest.java"),
            17
        );
	}

	public static void testSum(ProgramBuilder builder,
            ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        int expected[] = new int[21];
		for (int i = 0; i < 20; i++) {
			expected[i] = i*2;
		}
        expected[20] = 380;

        verifyResults(
            getOutput(builder, interpreter, "tests/Sum.java"),
            expected
        );
	}

	public static void testBinTree(ProgramBuilder builder,
            ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/BinaryTree.java"),
            16,100000000,8,16,4,8,12,14,16,20,24,28,1,1,1,0,1,4,8,14,16,20,24,28,0,0
        );
	}
    
	public static void testMultipleClassDecls(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/MainTestForPigletWithMultipleClassDecls.java"),
            1,3,2,3,2,3
        );
	}
    
	public static void testArray(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/MainTestForPigletArray.java"),
            0,1
        );
	}
    
    public static void testOO(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/OOTest.java"),
            42,43,44,0,45,46,0,1,47,48,0,1,2,49,50,0,1,2,3,51,52,0,1,2,3,4
        );
    }
    
    public static void testOOSimple(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/OOSimpleTest.java"),
            0,0,100000000,10101,44,55,111111111,42,0,0,100000000,10101,99,88,100000000,42,44,55,111111111
        );
    }
    
    public static void testChainedCall(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/ChainedCallTest.java"),
            5, 7, 14, 42
        );
    }
    
    public static void testCallInCall(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/CallInCallTest.java"),
            1337, 42, 4711
        );
    }

    public static void testCallChain(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/CallChainTest.java"),
            1,42,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,3,4242,2,84,1,123456,5,123456,4,42,128,555,128,555,128,555,128,555,128,555,128,555,128,555,128,555,128,555
        );
    }

    public static void testAllocTest(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/AllocTest.java"),
            2, 42, 88, 99
        );
    }

    public static void testAndTest(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/AndTest.java"),
            0, 0, 0, 1, 0, 1
        );
    }

    public static void testBubbleSortTest(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/BubbleSort.java"),
            20, 7, 12, 18, 2, 11, 6, 9, 19, 5, 99999, 2, 5, 6, 7, 9, 11, 12, 18, 19, 20, 0
        );
    }

    public static void testExtendsTest(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/ExtendsTest.java"),
            23, 23
        );
    }

    public static void testLinearSearch(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/LinearSearch.java"),
            10, 11, 12, 13, 14, 15, 16, 17, 18, 9999, 0, 1, 1, 0, 55
        );
    }

    public static void testLinkedList(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/LinkedList.java"),
            25, 10000000, 39, 25, 10000000, 22, 39, 25, 1, 0, 10000000, 28, 22, 39, 25, 2220000, -555, -555, 28, 22, 25, 33300000, 22, 25, 44440000, 0
        );
    }

    public static void testMoreThan4(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/MoreThan4.java"),
            1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1, 0
        );
    }

    public static void testQuickSort(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/QuickSort.java"),
            20, 7, 12, 18, 2, 11, 6, 9, 19, 5, 9999, 2, 5, 6, 7, 9, 11, 12, 18, 19, 20, 0
        );
    }

    public static void testTreeVisitor(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException, InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/TreeVisitor.java"),
            16, 100000000, 4, 8, 12, 14, 16, 20, 24, 28, 100000000, 50000000, 333, 333, 333, 28, 24, 333, 20, 16, 333, 333, 333, 14, 12, 8, 333, 4, 100000000, 1, 1, 1, 0, 1, 4, 8, 14, 16, 20, 24, 28, 0, 0
        );
    }

    public static void testManyVars(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException,
        InterruptedException, Parser.Exception {
        verifyResults(
            getOutput(builder, interpreter, "tests/ManyVars.java"),
            210, 84
        );
    }

    public static void testNPEObject(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException,
        InterruptedException, Parser.Exception {
        
        verifyError(getOutput(builder, interpreter, "tests/NPEObject.java"));
    }
    
    public static void testArrayOOB(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException,
        InterruptedException, Parser.Exception {
        
        verifyError(getOutput(builder, interpreter, "tests/ArrayOOB.java"));
    }
    
    public static void testArrayNPE(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException,
        InterruptedException, Parser.Exception {
        
        verifyError(getOutput(builder, interpreter, "tests/ArrayNPE.java"));
    }
    
    public static void testArrayLengthNPE(ProgramBuilder builder, ProgramInterpreter interpreter) throws IOException,
        InterruptedException, Parser.Exception {
        
        verifyError(getOutput(builder, interpreter, "tests/ArrayLengthNPE.java"));
    }
}
