package ConditionalStatements;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstBrother = Double.parseDouble(scanner.nextLine());
        double secondBrother = Double.parseDouble(scanner.nextLine());
        double thirdBrother = Double.parseDouble(scanner.nextLine());
        double timeFather = Double.parseDouble(scanner.nextLine());
        double totalTime = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        double timeWithRest = totalTime * 1.15;
        double timeLeft = timeFather - timeWithRest;

        System.out.printf("Cleaning time: %.2f\n", timeWithRest);

        if (timeLeft >= 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(Math.abs(timeLeft)));
        }


    }
}
