package FirstStepsInCoding;

import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeAquarium = length * width * height;
        double volumeAquariumInLiters = volumeAquarium * 0.001;

        System.out.printf("%.3f", volumeAquariumInLiters * (1 - percentage*0.01));

    }
}