package SimpleOperationsAndCalculations;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakesPrice = 45*cakes;
        double wafflesPrice = 5.80*waffles;
        double pancakesPrice = 3.20*pancakes;

        double cooksPrice = cooks * (cakesPrice+wafflesPrice+pancakesPrice);
        double totalSum = cooksPrice * days;
        double endSum = totalSum * 0.875;
        // double endSum = totalSum - (totalSum*0.125)
        // double endSum = totalSum * 0.875
        // double endSum = totalSum - (totalSum/8);
        // 1.0 / 8
        System.out.printf("%.2f", endSum);
    }
}
