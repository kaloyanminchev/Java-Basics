package ConditionalStatements;

        import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalProfit = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        int toysCount = puzzles + dolls + bears + minions + trucks;

        if (toysCount >= 50) {
            totalProfit = totalProfit * 0.75;
        }
        totalProfit = totalProfit * 0.90;

        if (totalProfit >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - priceTrip);
        }

        else  {
            System.out.printf("Not enough money! %.2f lv needed.", priceTrip - totalProfit);
        }
    }
}
