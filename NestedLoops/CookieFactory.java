package NestedLoops;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBatches = Integer.parseInt(scanner.nextLine());
        boolean isFlour = false;
        boolean isEggs = false;
        boolean isSugar = false;

        for (int i = 1; i <= countBatches; i++) {
            String input = scanner.nextLine();

            while (!"Bake!".equals(input)) {
                if ("flour".equals(input)) {
                    isFlour = true;
                } else if ("eggs".equals(input)) {
                    isEggs = true;
                } else if ("sugar".equals(input)) {
                    isSugar = true;
                }
                input = scanner.nextLine();
            }
            if (isFlour && isEggs && isSugar) {
                System.out.printf("Baking batch number %d...", i).println();
                isFlour = false;
                isEggs = false;
                isSugar = false;
            } else {
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            }

        }


    }
}
