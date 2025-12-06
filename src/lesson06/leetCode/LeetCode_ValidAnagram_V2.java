package lesson06.leetCode;

import java.util.Arrays;

public class LeetCode_ValidAnagram_V2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("act", "cat"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
