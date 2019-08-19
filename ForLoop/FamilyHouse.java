package ForLoop;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double sumElectricityBill = 0.0;
        double sumWaterBill = 20.00 * months;
        double sumInternetBill = 15.00 * months;
        double sumOther = 0.0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            sumElectricityBill += electricityBill;
            double otherBill = (electricityBill + 20 + 15) * 1.20;
            sumOther += otherBill;
        }
        double average = (sumElectricityBill + sumWaterBill + sumInternetBill + sumOther) / months;
        System.out.printf("Electricity: %.2f lv\n", sumElectricityBill);
        System.out.printf("Water: %.2f lv\n", sumWaterBill);
        System.out.printf("Internet: %.2f lv\n", sumInternetBill);
        System.out.printf("Other: %.2f lv\n", sumOther);
        System.out.printf("Average: %.2f lv", average);
    }
}
