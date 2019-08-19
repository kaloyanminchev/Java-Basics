package WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsBackHome = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsBackHome;
                if (totalSteps < 10000) {
                    System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
                }
                break;
            } else {
                int currentSteps = Integer.parseInt(input);
                totalSteps += currentSteps;
            }

        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        }
    }
}
