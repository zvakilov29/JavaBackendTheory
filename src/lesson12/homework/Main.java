package lesson12.homework;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long i = 0;

        while (true) {
            i++;

            new Order((int) i); // created but not stored

            if (i % 100 == 0) {
                long totalMB = runtime.totalMemory() / (1024 * 1024);
                long freeMB  = runtime.freeMemory() / (1024 * 1024);
                long usedMB  = totalMB - freeMB;

                System.out.println("Step: " + i
                        + " | Used: " + usedMB + " MB"
                        + " | Free: " + freeMB + " MB"
                        + " | Total: " + totalMB + " MB");
            }

            try {
                Thread.sleep(5); // small delay so you can observe changes
            } catch (InterruptedException ignored) {
            }
        }
    }
}
