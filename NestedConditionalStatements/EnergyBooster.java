package NestedConditionalStatements;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (fruit) {
            case "Watermelon":
                if ("small".equals(type)) {
                    price = 2 * 56.00 * count;
                } else if ("big".equals(type)) {
                    price = 5 * 28.70 * count;
                }
                break;
            case "Mango":
                if ("small".equals(type)) {
                    price = 2 * 36.66 * count;
                } else if ("big".equals(type)) {
                    price = 5 * 19.60 * count;
                }
                break;
            case "Pineapple":
                if ("small".equals(type)) {
                    price = 2 * 42.10 * count;
                } else if ("big".equals(type)) {
                    price = 5 * 24.80 * count;
                }
                break;
            case "Raspberry":
                if ("small".equals(type)) {
                    price = 2 * 20.00 * count;
                } else if ("big".equals(type)) {
                    price = 5 * 15.20 * count;
                }
                break;
        }
        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price *= 0.50;
        }
        System.out.printf("%.2f lv.", price);
    }
}
