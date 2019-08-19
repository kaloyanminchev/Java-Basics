package WhileLoop;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metersMade = 5364;
        int countDays = 1;
        while (metersMade < 8848) {
            String rest = scanner.nextLine();
            if (rest.equals("Yes")) {
                countDays++;
            } else if (rest.equals("END")) {
                System.out.println("Failed!");
                System.out.printf("%d", metersMade);
                break;
            }
            if (countDays > 5) {
                System.out.println("Failed!");
                System.out.printf("%d", metersMade);
                break;
            }
            int currentMeters = Integer.parseInt(scanner.nextLine());
            metersMade += currentMeters;

        }
        if (metersMade >= 8848) {
            System.out.printf("Goal reached for %d days!", countDays);
        }
    }
}
