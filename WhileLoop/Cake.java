package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeSize = width * length;
        boolean cakeEaten = false;
        while (cakeSize >= 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakeSize);
                cakeEaten = true;
                break;
            }
                int currentPieceOfCake = Integer.parseInt(input);
                cakeSize -= currentPieceOfCake;

        }
        if (!cakeEaten) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        }

    }
}
