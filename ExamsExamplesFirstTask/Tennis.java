package ExamsExamplesFirstTask;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oneRacketPrice = Double.parseDouble(scanner.nextLine());
        int countRackets = Integer.parseInt(scanner.nextLine());
        int countSneakers = Integer.parseInt(scanner.nextLine());

        double oneSneakersPrice = oneRacketPrice/6;
        double totalRacketPrice = oneRacketPrice * countRackets;
        double totalSneakersPrice = oneSneakersPrice * countSneakers;
        double otherEquip = (totalRacketPrice + totalSneakersPrice) * 0.20;

        double totalPrice = totalRacketPrice + totalSneakersPrice + otherEquip;

        double Djokovic = totalPrice / 8;
        double Sponsors = totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f\nPrice to be paid by sponsors %.0f", Math.floor(Djokovic), Math.ceil(Sponsors));

    }
}
