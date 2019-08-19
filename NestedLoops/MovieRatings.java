package NestedLoops;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviesToWatch = Integer.parseInt(scanner.nextLine());

        String movieWithHighestRate = "";
        double highestRate = Integer.MIN_VALUE;
        String movieWithLowestRate = "";
        double lowestRate = Integer.MAX_VALUE;

        double sumRates = 0;

        for (int i = 1; i <= moviesToWatch; i++) {
            String currentMovie = scanner.nextLine();
            double currentMovieRate = Double.parseDouble(scanner.nextLine());
            sumRates += currentMovieRate;

            if (currentMovieRate > highestRate) {
                highestRate = currentMovieRate;
                movieWithHighestRate = currentMovie;
            }
            if (currentMovieRate < lowestRate){
                lowestRate = currentMovieRate;
                movieWithLowestRate = currentMovie;
            }

        }

        double averageRate = sumRates / moviesToWatch;

        System.out.printf("%s is with highest rating: %.1f\n", movieWithHighestRate, highestRate);
        System.out.printf("%s is with lowest rating: %.1f\n", movieWithLowestRate, lowestRate);
        System.out.printf("Average rating: %.1f", averageRate);
    }
}
