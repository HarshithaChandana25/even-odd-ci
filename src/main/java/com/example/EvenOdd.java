
package com.example;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide one integer.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (isEven(number)) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
