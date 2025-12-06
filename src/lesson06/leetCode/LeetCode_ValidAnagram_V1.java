package lesson06.leetCode;

public class LeetCode_ValidAnagram_V1 {
    public static void main(String[] args) {
        System.out.println(isAnagram("act", "cat"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] charCounts = new int[26];

        for(int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
