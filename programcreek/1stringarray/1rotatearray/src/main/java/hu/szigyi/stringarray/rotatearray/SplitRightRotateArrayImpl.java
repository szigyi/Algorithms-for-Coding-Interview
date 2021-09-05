package hu.szigyi.stringarray.rotatearray;

public class SplitRightRotateArrayImpl implements RotateArray {

    public int[] rotate(int rotateBy, int[] arr) {
        if (rotateBy > arr.length) {
            rotateBy = rotateBy % arr.length;
        }

        int[] rotated = new int[arr.length];

        for (int i = 0; i < rotateBy; i++) {
            int shifted =  arr.length - rotateBy + i;
            rotated[i] = arr[shifted];
        }

        int j = 0;
        for (int i = rotateBy; i < arr.length; i++) {
            rotated[i] = arr[j];
            j++;
        }

        return rotated;
    }
}
