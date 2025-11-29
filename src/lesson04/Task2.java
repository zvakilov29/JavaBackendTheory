package lesson04;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 7, 1, 9, 4};
        int target = 10;

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == target){
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
