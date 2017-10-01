package hu.szigyi.stringarray.reversestring;

public class ReverseStringImpl implements ReverseString {

    @Override
    public String reverseWordsOrder(String str) {
        char[] chars = str.toCharArray();

        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            char c = chars[j];
            if (' ' == c) {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
        }

        reverse(chars, i, chars.length - 1);
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
