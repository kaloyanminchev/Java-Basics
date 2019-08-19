package ExamsExamplesFirstTask;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double champagne = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double whiskeySum = whiskey * whiskeyPrice;

        double champagnePrice = whiskeyPrice - whiskeyPrice*0.50;
        double winePrice = champagnePrice - champagnePrice*0.60;
        double waterPrice = champagnePrice - champagnePrice*0.90;

        double champagneSum = champagne * champagnePrice;
        double wineSum = wine * winePrice;
        double waterSum = water * waterPrice;
        double sum = whiskeySum+champagneSum+wineSum+waterSum;
        System.out.printf("%.2f", sum);

    }
}
