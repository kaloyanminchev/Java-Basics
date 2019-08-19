package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumAllGrades = 0;
        int countAllGrades = 0;

        while (!"Finish".equals(input)) {
            double sum = 0;
            for (int i = 1; i <= countJury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
                sumAllGrades += grade;
                countAllGrades++;
            }
            double average = sum / countJury;
            System.out.printf("%s - %.2f.\n", input, average);

            input = scanner.nextLine();
        }
        double averageAllGrades = sumAllGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", averageAllGrades);

    }
}
