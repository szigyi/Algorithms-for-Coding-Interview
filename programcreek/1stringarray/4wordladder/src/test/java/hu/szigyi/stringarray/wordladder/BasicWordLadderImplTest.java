package hu.szigyi.stringarray.wordladder;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BasicWordLadderImplTest {

    private WordLadder wordLadder;
    

    @Before
    public void setUp() throws Exception {
        wordLadder = new BasicWordLadderImpl();
    }

    @Test
    public void emptyDictionary() throws Exception {
        Set<String> dictionary = new HashSet<>();
        dictionary.addAll(Arrays.asList());
        String start = "hit";
        String end = "cog";
        int expected = 0;

        int length = wordLadder.transformationLength(dictionary, start, end);

        assertEquals(expected, length);
    }

    @Test
    public void noTransformation() throws Exception {
        Set<String> dictionary = new HashSet<>();
        dictionary.addAll(Arrays.asList("hot", "dot"));
        String start = "hit";
        String end = "cog";
        int expected = 0;

        int length = wordLadder.transformationLength(dictionary, start, end);

        assertEquals(expected, length);
    }

    @Test
    public void shortestTransformationLength() throws Exception {
        Set<String> dictionary = new HashSet<>();
        dictionary.addAll(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        String start = "hit";
        String end = "cog";
        int expected = 5;

        int length = wordLadder.transformationLength(dictionary, start, end);

        assertEquals(expected, length);
    }

}