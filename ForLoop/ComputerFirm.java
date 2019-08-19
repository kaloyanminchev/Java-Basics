package ForLoop;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPCs = Integer.parseInt(scanner.nextLine());
        double sumSales = 0.0;
        int sumRate = 0;
        for (int i = 0; i < countPCs; i++) {
            int possibleSales = Integer.parseInt(scanner.nextLine());
            if (possibleSales % 10 == 2) {
                sumRate += 2;
            } else if (possibleSales % 10 == 3) {
                possibleSales /= 10;
                sumSales += 0.50 * possibleSales;
                sumRate += 3;
            } else if (possibleSales % 10 == 4) {
                possibleSales /= 10;
                sumSales += 0.70 * possibleSales;
                sumRate += 4;
            } else if (possibleSales % 10 == 5) {
                possibleSales /= 10;
                sumSales += 0.85 * possibleSales;
                sumRate += 5;
            } else if (possibleSales % 10 == 6) {
                possibleSales /= 10;
                sumSales += possibleSales;
                sumRate += 6;
            }
        }
        double averageRate = sumRate * 1.0 / countPCs;
        System.out.printf("%.2f\n", sumSales);
        System.out.printf("%.2f", averageRate);
    }
}
