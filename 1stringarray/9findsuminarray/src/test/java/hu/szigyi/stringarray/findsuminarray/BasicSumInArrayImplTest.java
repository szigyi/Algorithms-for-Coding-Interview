package hu.szigyi.stringarray.findsuminarray;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BasicSumInArrayImplTest {

    private SumInArray sumInArray;

    @Parameterized.Parameters(name = "{index}: findSumInArray[{0}, {1}]=>{2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[] { 0, 0 }, new int[0], 9 },
                { new int[] { 0, 0 }, new int[] { 2, 7, 10, 15 }, 3 },
                { new int[] { 0, 1 }, new int[] { 2, 7, 10, 15 }, 9 },
                { new int[] { 1, 3 }, new int[] { 10, 7, 13, 2, 15 }, 9 }
        });
    }

    private int[] expected;

    private int[] array;

    private int target;

    public BasicSumInArrayImplTest(int[] expected, int[] array, int target) {
        this.expected = expected;
        this.array = array;
        this.target = target;
    }

    @Before
    public void setUp() throws Exception {
        sumInArray = new BasicSumInArrayImpl();
    }

    @Test
    public void test() {
        int[] actual = sumInArray.find(target, array);

        System.out.println(Arrays.toString(expected) + "==" + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

}