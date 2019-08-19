package NestedLoops;

import java.util.Scanner;

public class WeddingSeatsTOCHECK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lastSector = (char) scanner.nextLine().charAt(0);
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int oddRowsSeatsCount = Integer.parseInt(scanner.nextLine());

        int rowsCurrentSector = rowsFirstSector;
        int seatsCount = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= rowsCurrentSector; j++) {
                if (j % 2 != 0) {
                    for (int k = 0; k < oddRowsSeatsCount; k++) {
                        System.out.printf("%c%d%c", i, j, (char) k + 97).println();
                        seatsCount++;
                    }
                } else {
                    for (int k = 0; k < (oddRowsSeatsCount + 2); k++) {
                        System.out.printf("%c%d%c", i, j, (char) k + 97).println();
                        seatsCount++;
                    }
                }
            }
            rowsCurrentSector++;
        }
        System.out.println(seatsCount);
    }
}

