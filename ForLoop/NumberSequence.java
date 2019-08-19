package ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > biggestNumber) {
                biggestNumber = currentNumber;
            }
            if (currentNumber < smallestNumber) {
                smallestNumber = currentNumber;
            }
        }
        System.out.println("Max number: " + biggestNumber);
        System.out.println("Min number: " + smallestNumber);
    }
}
