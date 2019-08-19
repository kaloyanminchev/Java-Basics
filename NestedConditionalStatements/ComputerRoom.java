package NestedConditionalStatements;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        double price = 0;
        switch (month) {
            case "march":
            case "april":
            case "may":
                if ("day".equals(timeOfTheDay)) {
                    price = 10.50;
                } else {
                    price = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if ("day".equals(timeOfTheDay)) {
                    price = 12.60;
                } else {
                    price = 10.20;
                }
                break;
        }
        if (people >= 4) {
            price *= 0.90;
        }
        if (hours >= 5) {
            price *= 0.50;
        }
        double totalPrice = price * hours * people;
        System.out.printf("Price per person for one hour: %.2f\n", price);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
