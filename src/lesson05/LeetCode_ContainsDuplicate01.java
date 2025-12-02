package lesson05;

public class LeetCode_ContainsDuplicate01 {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 4, 1, 5, 9, 19, 4, 13};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println("Duplicate(s) detected!");
                    return;
                }
            }
        }

        System.out.println("No duplicates detected");
        return;
    }
}
