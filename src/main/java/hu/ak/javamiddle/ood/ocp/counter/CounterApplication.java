package hu.ak.javamiddle.ood.ocp.counter;

import java.util.Scanner;

public class CounterApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int input;
        do {

            System.out.println("""

                    1 - Print number
                    2 - Increment number
                    3 - Decrement number
                    0 - Exit
                    """);

            System.out.print("Your input: ");
            input = scanner.nextInt();

            switch (input) {
                case 1 -> System.out.println("The number is: " + number);
                case 2 -> {
                    System.out.println("Incrementing number");
                    number++;
                }
                case 3 -> {
                    System.out.println("Decrementing number");
                    number--;
                }
            }

        } while(input != 0);

        System.out.println("Done!");
    }

}
