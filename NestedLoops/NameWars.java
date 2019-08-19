package NestedLoops;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxPoints = 0;
        String winner = "";

        while (!"STOP".equals(name)) {
            int sumPoints = 0;
            for (int i = 0; i < name.length(); i++) {
                int currentPoints = name.charAt(i);
                sumPoints += currentPoints;
            }
            if (sumPoints > maxPoints) {
                maxPoints = sumPoints;
                winner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winner, maxPoints);
    }
}
