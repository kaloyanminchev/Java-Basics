package SimpleOperationsAndCalculations;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rectangleTables = Integer.parseInt(scanner.nextLine());
        double lengthRectangleTables = Double.parseDouble(scanner.nextLine());
        double widthRectangleTables = Double.parseDouble(scanner.nextLine());

        //rectangle=a*b; square=a*a

        double areaRectangle = rectangleTables * (lengthRectangleTables + 2 * 0.30) * (widthRectangleTables + 2 * 0.30);
        double areaSquare = rectangleTables * (lengthRectangleTables/2)*(lengthRectangleTables/2);
        double priceInUSD = areaRectangle * 7 + areaSquare * 9;
        double priceInBGN = priceInUSD * 1.85;

        System.out.printf("%.2f USD\n%.2f BGN", priceInUSD, priceInBGN);

    }
}
