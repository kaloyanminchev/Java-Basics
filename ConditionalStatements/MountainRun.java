package ConditionalStatements;

import java.util.Scanner;

public class MountainRun {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());
        double timeForDistance = distance * timeInSecondsForOneMeter;
        double addedTime = (Math.floor(distance / 50)) * 30;
        double totalTime = timeForDistance + addedTime;

        if (totalTime >= recordInSeconds) {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(totalTime - recordInSeconds));
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }

    }
}
