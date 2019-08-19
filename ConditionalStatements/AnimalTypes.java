package ConditionalStatements;

import java.util.Scanner;

public class AnimalTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        if ("dog".equals(animal)) {
            System.out.println("mammal");
        } else if ("crocodile".equals(animal) || "snake".equals(animal) || "tortoise".equals(animal)) {
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }
    }
}
