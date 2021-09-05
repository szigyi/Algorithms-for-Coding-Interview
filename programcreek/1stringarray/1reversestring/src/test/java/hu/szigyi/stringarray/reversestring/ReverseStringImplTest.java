package hu.szigyi.stringarray.reversestring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReverseStringImplTest {

    private ReverseString reverseString;

    @Parameterized.Parameters(name= "{index}: reverse({0})=>{1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "the sky is blue", "blue is sky the" },
                { "", "" },
                { "A", "A" },
                { "Aaaaaa", "Aaaaaa" }
        });
    }

    private String input;

    private String expected;

    public ReverseStringImplTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseStringImpl();
    }

    @Test
    public void reverseWordsOrder() throws Exception {
        String actual = reverseString.reverseWordsOrder(input);

        System.out.println(expected + "=>" + actual);
        assertEquals(expected, actual);
    }

}