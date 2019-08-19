package ExamsExamplesFirstTask;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthHall = Double.parseDouble(scanner.nextLine());
        double widthHall = Double.parseDouble(scanner.nextLine());
        double sideBar = Double.parseDouble(scanner.nextLine());
        double areaHall = lengthHall * widthHall;
        double areaBar = sideBar * sideBar;
        double dancing = 0.19 * areaHall;
        double freeSpace = areaHall - areaBar - dancing;
        double dancers = freeSpace/3.2;
        System.out.printf("%.0f", Math.ceil(dancers));
    }
}
