package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cashIn = Integer.parseInt(scanner.nextLine());
        double total = 0;

        while (cashIn-- > 0) {
            double value = Double.parseDouble(scanner.nextLine());
            if (value > 0) {
                total = total + value;
                System.out.printf("Increase: %.2f", value).println();
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f", total);
    }
}
