package NestedLoops;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quota = Integer.parseInt(scanner.nextLine());
        double priceAll = 0;
        int countFish = 0;
        boolean isEnd = false;
        for (int i = 1; i <= quota; i++) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                isEnd = true;
                break;
            }
            double fishKilos = Double.parseDouble(scanner.nextLine());
            int sumInput = 0;
            for (int j = 0; j < input.length(); j++) {
                sumInput += input.charAt(j);
            }
            double currentFishPrice = sumInput * 1.0 / fishKilos;
            if (i % 3 == 0) {
                priceAll -= currentFishPrice;
            } else {
                priceAll += currentFishPrice;
            }
            countFish++;
        }

        if (!isEnd) {
            System.out.println("Lyubo fulfilled the quota!");
        }

        if (priceAll < 0) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", countFish, Math.abs(priceAll));
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", priceAll);
        }

    }
}
