package NestedLoops;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceVoucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int currentPrice = 0;
        int countBoughtTickets = 0;
        int countOthers = 0;

        while (!"End".equals(input)) {
            if (input.length() > 8) {
                currentPrice = input.charAt(0) + input.charAt(1);
                if (currentPrice <= priceVoucher) {
                    priceVoucher -= currentPrice;

                } else {
                    break;
                }
                countBoughtTickets++;
            } else {
                currentPrice = input.charAt(0);
                if (currentPrice <= priceVoucher) {
                    priceVoucher -= currentPrice;

                } else {
                    break;
                }
                countOthers++;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d%n", countBoughtTickets);
        System.out.printf("%d", countOthers);
    }
}
