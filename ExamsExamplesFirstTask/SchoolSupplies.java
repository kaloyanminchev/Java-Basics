package ExamsExamplesFirstTask;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double cleaning = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens*5.80;
        double markersPrice = markers*7.20;
        double cleaningPrice = cleaning*1.20;
        double materialsSum = pensPrice+markersPrice+cleaningPrice;
        double dis = discount *0.01;
        double result = materialsSum-materialsSum*dis;
        //moje i direktno: double result=materialsSum-((materialsSum*discount)/100)

        System.out.printf("%.3f", result);
}
}
