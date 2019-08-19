package NestedLoops;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMen = Integer.parseInt(scanner.nextLine());
        int countWomen = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countMen; i++) {
            for (int j = 1; j <= countWomen; j++) {
                if (maxTables == 0) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
                maxTables--;

            }
        }

    }
}
