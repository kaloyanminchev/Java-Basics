package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());

        int space = widthSpace * lengthSpace * heightSpace;
        String input = scanner.nextLine();
        int boxes = 0;
        while (!"Done".equals(input)) {
            int currentBoxes = Integer.parseInt(input);
            boxes += currentBoxes;
            if (space < boxes) {
                break;
            }
            input = scanner.nextLine();
        }
        if ("Done".equals(input)) {
            System.out.printf("%d Cubic meters left.", space - boxes);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", boxes - space);
        }
    }
}
