package lesson19.leetcode;

public class LeetCode_BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 4, 8, 13, 22};
        int target = 13;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // avoids overflow

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }

        return -1;
    }
}


