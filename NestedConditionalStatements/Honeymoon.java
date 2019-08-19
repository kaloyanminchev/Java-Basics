package NestedConditionalStatements;

import java.util.Scanner;

public class Honeymoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String city = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (city) {
            case "Cairo":
                price = 2 * 250 * nights + 600;
                break;
            case "Paris":
                price = 2 * 150 * nights + 350;
                break;
            case "Lima":
                price = 2 * 400 * nights + 850;
                break;
            case "New York":
                price = 2 * 300 * nights + 650;
                break;
            case "Tokyo":
                price = 2 * 350 * nights + 700;
                break;
        }
        if (nights >= 1 && nights <= 4) {
            if ("Cairo".equals(city) || "New York".equals(city)) {
                price *= 0.97;
            }
        } else if (nights <= 9) {
            if ("Cairo".equals(city) || "New York".equals(city)) {
                price *= 0.95;
            } else if ("Paris".equals(city)) {
                price *= 0.93;
            }
        } else if (nights <= 24) {
            if ("Cairo".equals(city)) {
                price *= 0.90;
            } else if ("Paris".equals(city) || "New York".equals(city) || "Tokyo".equals(city)) {
                price *= 0.88;
            }
        } else if (nights <= 49) {
            if ("Tokyo".equals(city) || "Cairo".equals(city)) {
                price *= 0.83;
            } else if ("New York".equals(city) || "Lima".equals(city)) {
                price *= 0.81;
            } else if ("Paris".equals(city)) {
                price *= 0.78;
            }
        } else {
            price *= 0.70;
        }
        if (price <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
