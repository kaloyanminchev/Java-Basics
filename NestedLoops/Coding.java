package NestedLoops;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numberInString = "" + number;
        int countDigits = numberInString.length();

        for (int i = 1; i <= countDigits; i++) {
            int countRepeat = Integer.parseInt(numberInString.charAt(countDigits - i) + "");

            if (countRepeat == 0) {
                System.out.println("ZERO");
                continue;
            }
            char symbolToRepeat = (char) (countRepeat + 33);

            for (int j = 0; j < countRepeat; j++) {
                System.out.print(symbolToRepeat);
            }
            System.out.println();
        }
    }
}
