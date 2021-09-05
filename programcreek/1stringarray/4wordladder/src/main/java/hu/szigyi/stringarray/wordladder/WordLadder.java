package hu.szigyi.stringarray.wordladder;

import java.util.Set;

public interface WordLadder {

    int transformationLength(Set<String> dictionary, String start, String end);
}
