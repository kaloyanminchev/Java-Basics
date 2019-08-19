package NestedConditionalStatements;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        double gradeScholarship = 0;
        double socialScholarship = 0;

        if (income < minWage) {
            if (averageGrade >= 5.50) {
                gradeScholarship = averageGrade * 25;
                socialScholarship = 0.35 * minWage;
                if (socialScholarship > gradeScholarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
                } else {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScholarship));
                }
            } else if (averageGrade > 4.50) {
                socialScholarship = 0.35 * minWage;
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else if (income >= minWage) {
            if (averageGrade >= 5.50) {
                gradeScholarship = averageGrade * 25;
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScholarship));
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        }


    }


}

