package NestedLoops;

import java.util.Scanner;

public class NumbersTOCHECK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int modifiedNumber = number;

        int n = number / 100 + (number % 100) / 10;
        int m = number / 100 + number % 10;

        for (int rows = 0; rows < n; rows++) {
            for (int columns = 0; columns < m; columns++) {
                if (modifiedNumber % 5 == 0) {
                    modifiedNumber -= number / 100;
                } else if (modifiedNumber % 3 == 0) {
                    modifiedNumber -= (number % 100) / 10;
                } else {
                    modifiedNumber += number % 10;
                }
                System.out.printf("%d ", modifiedNumber);
            }
            System.out.println();
        }
    }
}
