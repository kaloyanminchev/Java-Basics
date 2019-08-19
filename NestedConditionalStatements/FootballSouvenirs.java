package NestedConditionalStatements;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int numberSouvenirs = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (country) {
            case "Argentina":
                if ("flags".equals(typeSouvenir)) {
                    price = 3.25 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("caps".equals(typeSouvenir)) {
                    price = 7.20 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("posters".equals(typeSouvenir)) {
                    price = 5.10 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.25 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else {
                    System.out.println("Invalid stock!");
                }
                break;
            case "Brazil":
                if ("flags".equals(typeSouvenir)) {
                    price = 4.20 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("caps".equals(typeSouvenir)) {
                    price = 8.50 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("posters".equals(typeSouvenir)) {
                    price = 5.35 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.20 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else {
                    System.out.println("Invalid stock!");
                }
                break;
            case "Croatia":
                if ("flags".equals(typeSouvenir)) {
                    price = 2.75 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("caps".equals(typeSouvenir)) {
                    price = 6.90 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("posters".equals(typeSouvenir)) {
                    price = 4.95 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.10 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else {
                    System.out.println("Invalid stock!");
                }
                break;
            case "Denmark":
                if ("flags".equals(typeSouvenir)) {
                    price = 3.10 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("caps".equals(typeSouvenir)) {
                    price = 6.50 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("posters".equals(typeSouvenir)) {
                    price = 4.80 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 0.90 * numberSouvenirs;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price);
                } else {
                    System.out.println("Invalid stock!");
                }
                break;
            default:
                System.out.println("Invalid country!");
                break;
        }

    }
}
