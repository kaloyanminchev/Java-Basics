package ExamsExamplesFirstTask;

import java.util.Scanner;

public class BasketEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainingTax = Integer.parseInt(scanner.nextLine());
        double sneakers = trainingTax * (1-0.4);
        double outfit = sneakers * (1-0.2);
        double ball = outfit / 4;
        double accessories = ball / 5;

        double totalCosts = trainingTax + sneakers + outfit + ball + accessories;

        System.out.printf("%.2f", totalCosts);
    }
}
