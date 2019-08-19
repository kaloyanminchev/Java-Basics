package WhileLoop;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pricePerformer = Integer.parseInt(scanner.nextLine());
        int moneyInHand = 0;
        int countGuests = 0;
        String input = scanner.nextLine();
        while (!input.equals("The restaurant is full")) {
            int currentNumberGuests = Integer.parseInt(input);
            countGuests += currentNumberGuests;
            if (currentNumberGuests < 5) {
                moneyInHand = (currentNumberGuests * 100) + moneyInHand;
            } else {
                moneyInHand = (currentNumberGuests * 70) + moneyInHand;
            }
            input = scanner.nextLine();
        }
        if (moneyInHand >= pricePerformer) {
            System.out.printf("You have %d guests and %d leva left.", countGuests, moneyInHand - pricePerformer);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", countGuests, moneyInHand);
        }
    }
}
