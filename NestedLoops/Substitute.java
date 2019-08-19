package NestedLoops;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        boolean isEven = i % 2 == 0 && k % 2 == 0;
                        boolean isOdd = j % 2 != 0 && l % 2 != 0;
                        if (isEven && isOdd) {
                            String KL = "" + i + j;
                            String MN = "" + k + l;

                            if (!KL.equals(MN)) {
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                counter++;
                            } else {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                        if (counter == 6) {
                            break;
                        }
                    }
                    if (counter == 6) {break;}
                }
                if (counter == 6) {break;}
            }
            if (counter == 6) {break;}
        }
    }
}
