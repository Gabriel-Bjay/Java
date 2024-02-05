package Beginner;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); // Use print instead of println to avoid a newline

        int number = input.nextInt(); // Take the input as an integer

        System.out.println("You have entered the number: " + number); // Concatenate string and integer using +
    }
}
