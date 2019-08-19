package WhileLoop;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countKids = 0;
        int countAdults = 0;
        int moneyToys = 0;
        int moneySweaters = 0;

        while (!input.equals("Christmas")) {
            int years = Integer.parseInt(input);
            if (years <= 16) {
                countKids++;
                moneyToys += 5;
            } else {
                countAdults++;
                moneySweaters += 15;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d\n", countAdults);
        System.out.printf("Number of kids: %d\n", countKids);
        System.out.printf("Money for toys: %d\n", moneyToys);
        System.out.printf("Money for sweaters: %d", moneySweaters);

    }
}
