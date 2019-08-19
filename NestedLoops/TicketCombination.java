package NestedLoops;

import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 'B'; i <= 'L'; i += 2) {
            for (int j = 'f'; j >= 'a'; j--) {
                for (int k = 'A'; k <= 'C'; k++) {
                    for (int l = 1; l <= 10; l++) {
                        for (int m = 10; m >= 1; m--) {
                            num--;
                            if (num == 0) {
                                int value = i + j + k + l + m;
                                System.out.printf("Ticket combination: %c%c%c%d%d\n", (char) i, (char) j, (char) k, l, m);
                                System.out.printf("Prize: %d lv.", value);
                            }
                        }
                    }
                }
            }
        }


    }
}
