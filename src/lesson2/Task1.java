package lesson2;

public class Task1 {
    public static void main(String[] args) {
        double grossSalary  = 2500;
        double taxRate = 0.14;

        double taxAmount = grossSalary * taxRate;
        double netSalary = grossSalary - taxAmount;

        System.out.printf("Gross Salary: %.2f AZN\n", grossSalary);
        System.out.printf("Tax Amount: %.2f AZN\n", taxAmount);
        System.out.printf("Net Salary: %.2f AZN\n", netSalary);
    }
}
