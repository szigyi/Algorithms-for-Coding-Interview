package hu.szigyi.stringarray.wordladder;

import java.util.Set;

public interface WordLadder {
    boolean transformable(Set<String> dictionary, String start, String end);
}
