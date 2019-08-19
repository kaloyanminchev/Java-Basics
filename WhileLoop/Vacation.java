package WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyTrip = Double.parseDouble(scanner.nextLine());
        double moneyInHand = Double.parseDouble(scanner.nextLine());
        int countSpendDays = 0;
        int countAllDays = 0;
        boolean moneyGathered = false;
        while (moneyInHand < moneyTrip) {
            String action = scanner.nextLine();
            double sumToSpendOrSave = Double.parseDouble(scanner.nextLine());
            countAllDays++;
            if ("spend".equals(action)) {
                countSpendDays++;
                moneyInHand -= sumToSpendOrSave;
                if (moneyInHand < sumToSpendOrSave) {
                    moneyInHand = 0;
                }
            } else {
                moneyInHand += sumToSpendOrSave;
                countSpendDays = 0;
            }
            if (countSpendDays == 5) {
                moneyGathered = true;
                System.out.println("You can't save the money.");
                System.out.printf("%d", countAllDays);
                break;
            }
        }
        if (!moneyGathered) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }
    }
}
