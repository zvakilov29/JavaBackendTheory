package lesson08.leetcode;

public class LeetCode_ContainerWithMostWater {
    public static void main(String[] args) {
        // Test Case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test 1 Max Area: " + maxArea(height1)); // Expected: 49

        // Test Case 2
        int[] height2 = {1, 1};
        System.out.println("Test 2 Max Area: " + maxArea(height2)); // Expected: 1
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // 1. Calculate current dimensions
            int width = right - left;

            // The water level is limited by the shorter wall
            int currentHeight = Math.min(height[left], height[right]);

            // 2. Calculate Area
            int currentArea = width * currentHeight;

            // 3. Update Maximum if we found a new best
            maxWater = Math.max(maxWater, currentArea);

            // 4. Decision: Which pointer to move?
            // Always move the shorter wall inward to try and find a taller one.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
