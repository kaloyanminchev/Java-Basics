package NestedConditionalStatements;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int weekendsInSofia = 48 - h;
        double weekendsInSofiaToPlay = (weekendsInSofia * (3.0 / 4)) + (p * (2.0 / 3));
        double playsInSofiaAndHomeTown = weekendsInSofiaToPlay + h;
        if ("leap".equals(year)) {
            playsInSofiaAndHomeTown *= 1.15;
            System.out.printf("%.0f", Math.floor(playsInSofiaAndHomeTown));
        } else if ("normal".equals(year)) {
            System.out.printf("%.0f", Math.floor(playsInSofiaAndHomeTown));
        }

    }
}
