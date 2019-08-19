package ExamsExamplesFirstTask;

import java.util.Scanner;

public class ShoppingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeForBreak = Integer.parseInt(scanner.nextLine());
        double peripheralPrice = Double.parseDouble(scanner.nextLine());
        double programPrice = Double.parseDouble(scanner.nextLine());
        double frappePrice = Double.parseDouble(scanner.nextLine());
        //3*2min = 6min - peripheral
        //2*2min = 4min - program
        int timeForFrappe = 5;
        int timeForPeripheral = 3*2;
        int timeForProgram = 2*2;
        int timeForRelax = timeForBreak - (timeForFrappe+ timeForPeripheral + timeForProgram);

        double peripheralSum = peripheralPrice * 3;
        double programSum = programPrice * 2;
        double spentMoney = frappePrice + peripheralSum + programSum;
        System.out.printf("%.2f",spentMoney).println();
        System.out.println(timeForRelax);

    }
}
