package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMovie = scanner.nextLine();
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;

        while (!"Finish".equals(nameMovie)) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int countTicketsCurrentMovie = 0;

            for (int i = 1; i <= freeSeats; i++) {
                String typeTicket = scanner.nextLine();
                if (typeTicket.equals("End")) {
                    break;
                }
                switch (typeTicket) {
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                }
                countTicketsCurrentMovie++;

            }
            double percentHowFullHallIs = countTicketsCurrentMovie * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", nameMovie, percentHowFullHallIs);

            nameMovie = scanner.nextLine();
        }

        int totalCountTickets = countStudent + countStandard + countKid;
        double percentStudent = countStudent * 1.0 / totalCountTickets * 100;
        double percentStandard = countStandard * 1.0 / totalCountTickets * 100;
        double percentKid = countKid * 1.0 / totalCountTickets * 100;

        System.out.printf("Total tickets: %d%n", totalCountTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.", percentKid);

    }
}
