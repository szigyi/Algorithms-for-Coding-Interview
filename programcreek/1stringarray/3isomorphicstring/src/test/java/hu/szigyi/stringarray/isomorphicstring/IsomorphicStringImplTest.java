package hu.szigyi.stringarray.isomorphicstring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IsomorphicStringImplTest {

    private IsomorphicString isomorphicString;

    @Parameterized.Parameters(name = "{index}: isomorphic[{0}, {1}]=>{2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "egg", "add", true },
                { "", "", true },
                { "egg", "a", false },
                { "egg", null, false },
                { "aabbcc", "ffggkk", true },
                { "abacbc", "kfgfgk", false }
        });
    }

    private String input1;

    private String input2;

    private boolean expected;

    public IsomorphicStringImplTest(String input1, String input2, boolean expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Before
    public void init() {
        isomorphicString = new IsomorphicStringImpl();
    }

    @Test
    public void isomorphic() throws Exception {
        boolean actual = isomorphicString.isomorphic(input1, input2);

        assertEquals(expected, actual);
    }


}