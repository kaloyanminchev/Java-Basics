package ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecsForOneMeter = Double.parseDouble(scanner.nextLine());
        double timeForTotalDistance = distance * timeInSecsForOneMeter;
        double addTime = Math.floor(distance / 15) * 12.5;
        double totalTime = timeForTotalDistance + addTime;

        if (totalTime < recordInSecs) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(totalTime - recordInSecs));
        }

    }
}
