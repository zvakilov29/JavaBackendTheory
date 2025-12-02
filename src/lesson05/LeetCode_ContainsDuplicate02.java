package lesson05;

import java.util.Arrays;

public class LeetCode_ContainsDuplicate02 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 1, 5, 9, 19, 4, 13};

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("Duplicate(s) detected!");
                return;
            }
        }

        System.out.println("No duplicates detected");
        return;
    }
}
