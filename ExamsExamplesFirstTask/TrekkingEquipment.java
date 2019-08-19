package ExamsExamplesFirstTask;

import java.util.Scanner;

public class TrekkingEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int climbersNum = Integer.parseInt(scanner.nextLine());
        int carabinersNum = Integer.parseInt(scanner.nextLine());
        int ropesNum = Integer.parseInt(scanner.nextLine());
        int pikelNum = Integer.parseInt(scanner.nextLine());
        int carabinersPrice = carabinersNum*36;
        double ropesPrice = ropesNum*3.60;
        double pikelPrice = pikelNum*19.80;
        double sum = (carabinersPrice+ropesPrice+pikelPrice)*climbersNum;
        double result = sum+sum*0.20;
        System.out.printf("%.2f",result);

    }
}
