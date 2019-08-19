package WhileLoop;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double gradeSum = 0;
        int failCount = 0;
        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradeSum += grade;
                counter++;
            } else {
                failCount++;
            }
            if (failCount == 2) {
                break;
            }
        }
        if (failCount != 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradeSum / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        }
    }
}

