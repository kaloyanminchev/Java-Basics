package FirstStepsInCoding;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // volume = length * width * height
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volume = length * width *  height;
        double volumeInLiters = volume * 0.001;
        // става и така да се изпише: volumeInLiters * (1 - percentage * 0.01)
        //става и:  double result=volumeInLiters * (1 - percentage/100) и после да форматираме result

        System.out.printf("%.3f", volumeInLiters * (1 - percentage/100));

    }
}
