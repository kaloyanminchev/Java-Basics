package SimpleOperationsAndCalculations;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice * (1 - 0.50);
        double winePrice = rakiaPrice * (1 - 0.40);
        double beerPrice = rakiaPrice * (1 - 0.80);

        double rakiaSum = rakia * rakiaPrice;
        double beerSum = beer * beerPrice;
        double wineSum = wine * winePrice;
        double whiskeySum = whiskey * whiskeyPrice;
        double endSum = rakiaSum + beerSum + wineSum + whiskeySum;

        System.out.printf("%.2f", endSum);

    }
}
