package NestedLoops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breads = Integer.parseInt(scanner.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String nameBakerMaxPoints = "";

        for (int i = 1; i <= breads; i++) {
            String nameBaker = scanner.nextLine();
            String input = scanner.nextLine();
            int sumGrades = 0;
            while (!"Stop".equals(input)) {
                int grade = Integer.parseInt(input);
                sumGrades += grade;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", nameBaker, sumGrades);
            if (sumGrades > maxPoints) {
                maxPoints = sumGrades;
                nameBakerMaxPoints = nameBaker;
                System.out.printf("%s is the new number 1!%n", nameBakerMaxPoints);
            }

        }
        System.out.printf("%s won competition with %d points!", nameBakerMaxPoints, maxPoints);

    }
}
