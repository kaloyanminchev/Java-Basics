package NestedConditionalStatements;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if ("summer".equals(season)) {
                price = 0.30 * budget;
                System.out.printf("Camp - %.2f", price);
            } else if ("winter".equals(season)) {
                price = 0.70 * budget;
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if ("summer".equals(season)) {
                price = 0.40 * budget;
                System.out.printf("Camp - %.2f", price);
            } else if ("winter".equals(season)) {
                price = 0.80 * budget;
                System.out.printf("Hotel - %.2f", price);
            }
        } else {
            System.out.println("Somewhere in Europe");
            price = 0.90 * budget;
            System.out.printf("Hotel - %.2f", price);
        }

    }
}
