package ExamsExamplesFirstTask;

import java.util.Scanner;

public class ChangeBuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double levBitcoin = bitcoin * 1168;
        double dollar = yuan * 0.15;
        double levDollar = dollar * 1.76;
        double lev = levBitcoin + levDollar;
        double euro = lev / 1.95;

        // (1 - commission/100) * euro

        double result = euro * (1 - commission/100);
        System.out.printf("%.2f", result);
    }
}