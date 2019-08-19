package NestedLoops;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                for (int k = 1; k <= num3; k++) {
                    boolean isEven = i % 2 == 0 && k % 2 == 0;
                    int counter = 0;

                        for (int l = 1; l <= j; l++) {
                            if (j % l == 0) {
                                counter++;
                            }
                        }

                    if (counter == 2 && isEven){
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
