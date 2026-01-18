package lesson12.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode_CarFleet {
    public static void main(String[] args) {
        int[] position = {10, 8, 0, 5, 3};
        int[] speed    = { 2, 4, 1, 1, 3};
        int target = 12;

        System.out.println(carFleet(target, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0])); // position desc

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int pos = cars[i][0];
            int spd = cars[i][1];

            double t = (target - pos) / (double) spd;

            if (stack.isEmpty() || t > stack.peek()) {
                stack.push(t);
            }
            // else: merges into fleet ahead, so don't push anything
        }

        return stack.size();
    }

}
