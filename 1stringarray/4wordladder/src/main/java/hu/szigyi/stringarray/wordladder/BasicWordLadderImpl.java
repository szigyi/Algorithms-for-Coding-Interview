package hu.szigyi.stringarray.wordladder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.Stack;

public class BasicWordLadderImpl implements WordLadder {

    private static final Logger LOG = LoggerFactory.getLogger(BasicWordLadderImpl.class);

    @Override
    public int transformationLength(Set<String> dictionary, String start, String end) {
        dictionary.add(end);
        Stack<String> tracker = new Stack<>();
        tracker.add(start);

        int length = 0;
        while (!tracker.isEmpty()) {
            String currentString = tracker.pop();
            if (end.equals(currentString)) {
                return length;
            }

            boolean found = false;
            char[] current = currentString.toCharArray();
            for (int i = 0; i < current.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (current[i] == c) {
                        continue;
                    }
                    char[] temp = current.clone();
                    temp[i] = c;
                    String candidate = new String(temp);
                    if (dictionary.contains(candidate)) {
                        LOG.info("Found {}", candidate);
                        length++;
                        tracker.add(candidate);
                        dictionary.remove(candidate);
                        current = candidate.toCharArray();
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        }
        return 0;
    }
}
