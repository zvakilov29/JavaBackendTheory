package lesson21.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        int lo = 1;
        int hi = 0;
        for(int p : piles) hi = Math.max(hi, p);

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            long hours = 0;
            for (int p : piles) {
                hours += (p + (long) mid - 1) / mid; // ceil(p / mid)
                if (hours > h) break;
            }

            if (hours <= h) {
                hi = mid;      // can finish, try smaller speed
            } else {
                lo = mid + 1;  // too slow, increase speed
            }
        }

        System.out.println(lo);
    }
}
