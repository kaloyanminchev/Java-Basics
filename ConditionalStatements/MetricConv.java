package ConditionalStatements;

import java.util.Scanner;

public class MetricConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String metricInput = scanner.nextLine();
        String metricOutput = scanner.nextLine();

        if (metricInput.equals("mm")) {
            number = number / 1000;
        } else if (metricInput.equals("cm")) {
            number = number / 100;
        }
        if (metricOutput.equals("mm")) {
            number = number * 1000;
        } else if (metricOutput.equals("cm")) {
            number = number * 100;
        }
        System.out.printf("%.3f", number);


    }
}
