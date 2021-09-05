package hu.szigyi.stringarray.rotatearray;

public class ReverseLeftRotateArrayImpl implements RotateArray {

    @Override
    public int[] rotate(int rotateBy, int[] arr) {
        if (rotateBy > arr.length) {
            rotateBy = rotateBy % arr.length;
        }

        int splitter = rotateBy;
        reverse(arr, 0, splitter - 1);
        reverse(arr, splitter, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    private int[] reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
