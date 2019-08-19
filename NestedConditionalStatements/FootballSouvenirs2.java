package NestedConditionalStatements;

import java.util.Scanner;

public class FootballSouvenirs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int numberSouvenirs = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean countryTrue = "Argentina".equals(country) ||
                "Brazil".equals(country) ||
                "Croatia".equals(country) ||
                "Denmark".equals(country);
        boolean souvenirTrue = "flags".equals(typeSouvenir) ||
                "caps".equals(typeSouvenir) ||
                "posters".equals(typeSouvenir) ||
                "stickers".equals(typeSouvenir);
        switch (country) {
            case "Argentina":
                if ("flags".equals(typeSouvenir)) {
                    price = 3.25;
                } else if ("caps".equals(typeSouvenir)) {
                    price = 7.20;
                } else if ("posters".equals(typeSouvenir)) {
                    price = 5.10;
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.25;
                }
                break;
            case "Brazil":
                if ("flags".equals(typeSouvenir)) {
                    price = 4.20;
                } else if ("caps".equals(typeSouvenir)) {
                    price = 8.50;
                } else if ("posters".equals(typeSouvenir)) {
                    price = 5.35;
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.20;
                }
                break;
            case "Croatia":
                if ("flags".equals(typeSouvenir)) {
                    price = 2.75;
                } else if ("caps".equals(typeSouvenir)) {
                    price = 6.90;
                } else if ("posters".equals(typeSouvenir)) {
                    price = 4.95;
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 1.10;
                }
                break;
            case "Denmark":
                if ("flags".equals(typeSouvenir)) {
                    price = 3.10;
                } else if ("caps".equals(typeSouvenir)) {
                    price = 6.50;
                } else if ("posters".equals(typeSouvenir)) {
                    price = 4.80;
                } else if ("stickers".equals(typeSouvenir)) {
                    price = 0.90;
                }
                break;
        }
        if (countryTrue && souvenirTrue) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, typeSouvenir, country, price * numberSouvenirs);
        } else if (!countryTrue) {
            System.out.println("Invalid country!");
        } else {
            System.out.println("Invalid stock!");
        }
    }
}


