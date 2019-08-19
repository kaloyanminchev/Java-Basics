package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalSec = first + second + third;

        int mins = totalSec / 60;
        int secs = totalSec % 60;

        if (secs < 10) {
            System.out.printf("%d:0%d", mins, secs);
        }else {
            System.out.printf("%d:%d", mins, secs);
        }


    }
}