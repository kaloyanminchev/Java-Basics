package ForLoop;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countAll = 0;
        double sum = 0.0;
        for (int i = 0; i < numberStudents; i++) {
            double examGrade = Double.parseDouble(scanner.nextLine());
            if (examGrade <= 2.99) {
                countP1++;
            } else if (examGrade <= 3.99) {
                countP2++;
            } else if (examGrade <= 4.99) {
                countP3++;
            } else {
                countP4++;
            }
            sum += examGrade;
            countAll++;
        }
        double ave = sum / countAll;
        double p1 = (countP1 * 1.0 / numberStudents) * 100;
        double p2 = (countP2 * 1.0 / numberStudents) * 100;
        double p3 = (countP3 * 1.0 / numberStudents) * 100;
        double p4 = (countP4 * 1.0 / numberStudents) * 100;
        System.out.printf("Top students: %.2f%%\n", p4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", p3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", p2);
        System.out.printf("Fail: %.2f%%\n", p1);
        System.out.printf("Average: %.2f", ave);

    }
}
