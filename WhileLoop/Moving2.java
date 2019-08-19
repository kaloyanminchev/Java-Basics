package WhileLoop;

import java.util.Scanner;

public class Moving2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());

        int space = widthSpace * lengthSpace * heightSpace;
        String input = scanner.nextLine();
        while (!"Done".equals(input)) {
            int boxCount = Integer.parseInt(input);
            space = space - boxCount;

            if (space < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (space >= 0) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }
    }
}