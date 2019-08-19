package NestedLoops;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countWin = 0;
        int countLost = 0;
        int countAllGames = 0;
        while (!"End of tournaments".equals(input)) {
            int countGames = Integer.parseInt(scanner.nextLine());
            countAllGames += countGames;
            for (int i = 1; i <= countGames; i++) {
                int scoredPoints = Integer.parseInt(scanner.nextLine());
                int receivedPoints = Integer.parseInt(scanner.nextLine());

                if (scoredPoints > receivedPoints) {
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, input, scoredPoints - receivedPoints);
                } else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, input, receivedPoints - scoredPoints);
                }
            }

            input = scanner.nextLine();
        }
        double percentWins = countWin * 1.0 / countAllGames * 100;
        double percentLost = countLost * 1.0 / countAllGames * 100;

        System.out.printf("%.2f%% matches win%n", percentWins);
        System.out.printf("%.2f%% matches lost", percentLost);
    }
}
