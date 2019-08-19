package ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int savedMoney = 0;
        int countEvenYears = 0;
        int countToys = 0;
        for (int year = 1; year <= age; year++) {
            if (year % 2 == 0) {
                countEvenYears++;
                savedMoney += 10 * countEvenYears;
                savedMoney--;

            } else {
                countToys++;
            }
        }
        int totalPriceToys = countToys * priceToy;
        int totalSum = totalPriceToys + savedMoney;

        if (totalSum >= washingMachine) {
            System.out.printf("Yes! %.2f", totalSum - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - totalSum);
        }

    }
}
