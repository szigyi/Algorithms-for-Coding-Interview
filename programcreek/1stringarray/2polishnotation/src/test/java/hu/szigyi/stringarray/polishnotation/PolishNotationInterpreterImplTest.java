package hu.szigyi.stringarray.polishnotation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PolishNotationInterpreterImplTest {

    private PolishNotationInterpreter polishNotationInterpreter;

    @Parameterized.Parameters(name= "{index}: interpret[{0}]=>{1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[] {"2", "1", "+", "3", "*"}, 9 },
                { new String[] {"3", "2", "4", "+", "*"}, 18 },
                { new String[] {"2"}, 2 }
        });
    }

    private String[] input;

    private int expected;

    public PolishNotationInterpreterImplTest(String[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void init() {
        polishNotationInterpreter = new PolishNotationInterpreterImpl();
    }

    @Test
    public void interpret() throws Exception {
        long actual = polishNotationInterpreter.interpret(input);

        assertEquals(expected, actual);
    }

}