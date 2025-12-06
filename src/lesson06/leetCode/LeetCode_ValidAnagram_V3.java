package lesson06.leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_ValidAnagram_V3 {
    public static void main(String[] args) {
        System.out.println(isAnagram("act", "cat"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            int newCount = map.get(c) - 1;

            if (newCount == 0) {
                map.remove(c);
            } else {
                map.put(c, newCount);
            }
        }
        return true;
    }
}