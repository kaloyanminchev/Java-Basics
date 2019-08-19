package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double area = 0;
        if(input.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        }else if(input.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        }else if(input.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        }else if(input.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (a * h) / 2;
        }

        System.out.printf("%.3f", area);

    }
}
