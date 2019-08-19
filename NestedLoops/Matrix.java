package NestedLoops;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int first = a; first <= b; first++) {
            for (int second = a; second <= b; second++) {
                for (int third = c; third <= d; third++) {
                    for (int fourth = c; fourth <= d; fourth++) {
                        boolean checkSumDiagonals = (first + fourth) == (second + third);
                        boolean checkNotEqualRow = first != second && third != fourth;

                        if (checkSumDiagonals && checkNotEqualRow) {
                            System.out.println("" + first + second);
                            System.out.println("" + third + fourth);
                            System.out.println();
                        }
                    }
                }

            }
            
        }
    }
}
