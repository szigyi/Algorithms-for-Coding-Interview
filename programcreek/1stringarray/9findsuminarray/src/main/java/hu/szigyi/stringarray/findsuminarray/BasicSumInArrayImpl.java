package hu.szigyi.stringarray.findsuminarray;

public class BasicSumInArrayImpl implements SumInArray {

    @Override
    public int[] find(long target, int[] arr) {
        if (arr.length < 2) {
            return new int[] { 0, 0 };
        }
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];

                if (first + second == target) {
                    return new int[]{ i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
