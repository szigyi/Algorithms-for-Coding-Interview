package hu.szigyi.stringarray.rotatearray;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class ReverseLeftRotateArrayImplTest {

    private RotateArray rotateArray;

    @Parameterized.Parameters(name= "{index}: rotate[{0}, {1}]={2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 4, new int[]{1, 2, 3, 4, 5, 6}, new int[]{5, 6, 1, 2, 3, 4} },
                { 4, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{5, 6, 7, 1, 2, 3, 4} },
                { 3, new int[]{1, 2, 3, 4, 5, 6}, new int[]{4, 5, 6, 1, 2, 3} },
                { 0, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6} },
                { 6, new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6} },
                { 2, new int[]{1}, new int[]{1} },
                { 0, new int[0], new int[0] }
        });
    }

    private int rotateBy;

    private int[] inputArray;

    private int[] expectedArray;

    public ReverseLeftRotateArrayImplTest(int rotateBy, int[] inputArray, int[] expectedArray) {
        this.rotateBy = rotateBy;
        this.inputArray = inputArray;
        this.expectedArray = expectedArray;
    }

    @Before
    public void setUp() throws Exception {
        rotateArray = new ReverseLeftRotateArrayImpl();
    }

    @Test
    public void rotate() throws Exception {
        int[] rotated = rotateArray.rotate(rotateBy, inputArray);

        System.out.println(Arrays.toString(rotated) + "=>" + Arrays.toString(expectedArray));
        assertArrayEquals(expectedArray, rotated);
    }

}