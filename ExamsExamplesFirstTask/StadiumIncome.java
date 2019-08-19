package ExamsExamplesFirstTask;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sectorsNumber = Integer.parseInt(scanner.nextLine());
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double sectorIncome = stadiumCapacity * ticketPrice / sectorsNumber;
        double totalIncome = sectorIncome * sectorsNumber;
        double charityMoney = (totalIncome - 0.75*sectorIncome)* 0.125;
        System.out.printf("Total income - %.2f BGN", totalIncome).println();
        System.out.printf("Money for charity - %.2f BGN", charityMoney);
    }
}
