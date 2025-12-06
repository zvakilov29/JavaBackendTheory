package lesson05;

import java.util.Arrays;

public class WeatherAnalysis {
    public static void main(String[] args) {
        double[] temperatures = new double[]{20.5, 21.4, 19.1, 18.9, 20.8, 21.2, 20.7};

        double sum = 0;
        double maxTemp = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }

            sum += temperatures[i];
        }

        double averageTemp = sum / temperatures.length;

        System.out.println("Temperatures: " + Arrays.toString(temperatures));
        System.out.printf("Average temperature: %.2f degrees\n", averageTemp);
        System.out.println("Maximum temperature: " + maxTemp + " degrees");
    }
}
