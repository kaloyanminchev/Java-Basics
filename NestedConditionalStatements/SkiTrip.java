package NestedConditionalStatements;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        double price = 0;
        int nights = days - 1;
        switch (roomType) {
            case "room for one person":
                price = 18.00 * nights;
                break;
            case "apartment":
                if (nights < 10) {
                    price = (25.00 * nights) * 0.70;
                } else if (nights <= 15) {
                    price = (25.00 * nights) * 0.65;
                } else {
                    price = (25.00 * nights) * 0.50;
                }
                break;
            case "president apartment":
                if (nights < 10) {
                    price = (35.00 * nights) * 0.90;
                } else if (nights <= 15) {
                    price = (35.00 * nights) * 0.85;
                } else {
                    price = (35.00 * nights) * 0.80;
                }
                break;
        }
        if ("positive".equals(feedback)) {
            price *= 1.25;
        } else {
            price *= 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
