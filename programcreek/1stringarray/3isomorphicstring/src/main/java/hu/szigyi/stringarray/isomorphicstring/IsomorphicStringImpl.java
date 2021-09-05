package hu.szigyi.stringarray.isomorphicstring;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringImpl implements IsomorphicString {

    @Override
    public boolean isomorphic(String str1, String str2) {
        if (null == str1 || null == str2) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        char[] ca1 = str1.toCharArray();
        char[] ca2 = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = ca1[i];
            char c2 = ca2[i];
            if (map.containsKey(c1)) {
                if (!map.containsValue(c2)) {
                    return false;
                }
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }
}
