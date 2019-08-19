package NestedConditionalStatements;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractDuration = scanner.nextLine();
        String contractType = scanner.nextLine();
        String dessert = scanner.nextLine();
        int monthsToPay = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (contractType) {
            case "Small":
                if ("one".equals(contractDuration)) {
                    price = 9.98;
                } else if ("two".equals(contractDuration)) {
                    price = 8.58;
                }
                break;
            case "Middle":
                if ("one".equals(contractDuration)) {
                    price = 18.99;
                } else if ("two".equals(contractDuration)) {
                    price = 17.09;
                }
                break;
            case "Large":
                if ("one".equals(contractDuration)) {
                    price = 25.98;
                } else if ("two".equals(contractDuration)) {
                    price = 23.59;
                }
                break;
            case "ExtraLarge":
                if ("one".equals(contractDuration)) {
                    price = 35.99;
                } else if ("two".equals(contractDuration)) {
                    price = 31.79;
                }
                break;
        }
        if ("yes".equals(dessert)) {
            if (price <= 10.00) {
                price += 5.50;
            } else if (price <= 30.00) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }
        if ("two".equals(contractDuration)) {
            price = price - (price * 0.0375);
        }
        price = price * monthsToPay;
        System.out.printf("%.2f lv.", price);
    }
}
