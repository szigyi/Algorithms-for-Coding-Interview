package hu.szigyi.stringarray.findsuminarray;

public class ScanSumInArrayImpl implements SumInArray {

    /**
     *
     * @param target
     * @param arr Should be sorted!
     * @return
     */
    @Override
    public int[] find(long target, int[] arr) {
        if (arr.length < 2) {
            return new int[] { 0, 0 };
        }

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int x = arr[i] + arr[j];
            if (x < target) {
                ++i;
            } else if (x > target) {
                j--;
            } else {
                return new int[] { i, j };
            }
        }
        return new int[] { 0, 0 };
    }
}
