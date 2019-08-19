package NestedConditionalStatements;

import java.util.Scanner;

public class Scholarship2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        if (income < minSalary && grade >= 5.50) {
            double social = 0.35 * minSalary;
            double excellence = 25 * grade;
            if (social > excellence) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellence));
            }
        } else if (income >= minSalary && grade >= 5.50) {
            double excellence = 25 * grade;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellence));
        } else if (income < minSalary && grade < 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (income >= minSalary && grade < 5.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (income < minSalary && grade > 4.50) {
            double social = 0.35 * minSalary;
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
        }


    }
}
