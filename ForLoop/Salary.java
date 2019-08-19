package ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int charge = 0;
        boolean noMoney = false;
        for (int i = 0; i < tabs; i++) {
            String name = scanner.nextLine();
            switch (name) {
                case "Facebook":
                    charge = 150;
                    break;
                case "Instagram":
                    charge = 100;
                    break;
                case "Reddit":
                    charge = 50;
                    break;
                default:
                    charge = 0;
                    break;
            }
            salary -= charge;
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                noMoney = true;
                break;
            }
        }
        if (!noMoney) {
            System.out.println(salary);
        }
    }
}
