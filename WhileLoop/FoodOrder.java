package WhileLoop;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sumOrder = 2.50;
        int countOrderedProducts = 0;
        while (!input.equals("Order")) {
            double priceProduct = Double.parseDouble(scanner.nextLine());
            sumOrder += priceProduct;
            if (sumOrder > budget) {
                System.out.println("You will exceed the budget if you order this!");
                sumOrder -= priceProduct;
            } else {
                countOrderedProducts++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You ordered %d items!", countOrderedProducts).println();
        System.out.printf("Total: %.2f", sumOrder);
    }
}
