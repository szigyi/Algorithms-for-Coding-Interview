package hu.szigyi.stringarray.findsuminarray;

import java.util.HashMap;
import java.util.Map;

public class MapSumInArrayImpl implements SumInArray {

    @Override
    public int[] find(long target, int[] arr) {
        if (arr.length < 2) {
            return new int[] { 0, 0 };
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int actual = arr[i];
            if (map.containsKey(actual)) {
                return new int[] { map.get(actual), i };
            } else {
                map.put((int) (target - actual), i);
            }
        }
        return new int[] { 0, 0 };
    }
}
