package ExamsExamplesFirstTask;

import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceDepartureTicket = Double.parseDouble(scanner.nextLine());
        double priceReturnTicket = Double.parseDouble(scanner.nextLine());
        double pricePerGame = Double.parseDouble(scanner.nextLine());
        int games = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double flightsPriceForAll = 6 * (priceDepartureTicket + priceReturnTicket);
        double flightsPriceForAllAfterDiscount = flightsPriceForAll * (1 - discount*0.01);
        double priceGamesForAll = 6 * pricePerGame * games;
        double totalSumForAll = flightsPriceForAllAfterDiscount + priceGamesForAll;
        double totalSumForOne = totalSumForAll / 6;
        System.out.printf("Total sum: %.2f lv.\nEach friend has to pay %.2f lv.", totalSumForAll, totalSumForOne);
    }
}
