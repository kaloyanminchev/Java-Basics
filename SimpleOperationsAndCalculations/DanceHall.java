package SimpleOperationsAndCalculations;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lHall = Double.parseDouble(scanner.nextLine());
        double wHall = Double.parseDouble(scanner.nextLine());
        double aMeters = Double.parseDouble(scanner.nextLine());
        // rectangle= lHall * wHall
        double areaHall = (lHall*100) * (wHall*100);
        double areaSquare = (aMeters*100) * (aMeters*100);
        double bench = areaHall / 10;
        double freeSpaceHall = areaHall-areaSquare-bench;
        double dancer = freeSpaceHall/(40+7000);

        System.out.printf("%.0f",Math.floor(dancer));


    }
}
