package ExamsExamplesFirstTask;

import java.util.Scanner;

public class ChristmasSweets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baklavaPrice = Double.parseDouble(scanner.nextLine());
        double muffinPrice = Double.parseDouble(scanner.nextLine());
        double shtolenKilos = Double.parseDouble(scanner.nextLine());
        double bonbonsKilos = Double.parseDouble(scanner.nextLine());
        int buscuitsKilos = Integer.parseInt(scanner.nextLine());

        double shtolenPrice = baklavaPrice + baklavaPrice*0.60;
        double shtolenSum = shtolenKilos*shtolenPrice;
        double bonbonsPrice = muffinPrice + muffinPrice*0.80;
        double bonbonsSum = bonbonsKilos*bonbonsPrice;
        double buscuitsSum = buscuitsKilos*7.50;

        double sum = shtolenSum+bonbonsSum+buscuitsSum;
        System.out.printf("%.2f",sum);

    }
}
