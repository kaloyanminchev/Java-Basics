package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        int countPoorGrades = 0;
        int sumGrades = 0;
        int countGrades = 0;
        String lastTask = "";
        while (!"Enough".equals(task)) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
            countGrades++;

            if (grade <= 4) {
                countPoorGrades++;
            }
            if (countPoorGrades == maxPoorGrades) {
                System.out.printf("You need a break, %d poor grades.", countPoorGrades);
                break;
            }
            lastTask = task;
            task = scanner.nextLine();
        }


        if (task.equals("Enough")) {
            double average = sumGrades * 1.0 / countGrades;
            System.out.printf("Average score: %.2f\n", average);
            System.out.printf("Number of problems: %d\n", countGrades);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
