package java_fundamentals;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print the welcome message
        System.out.println("Welcome " + name);

        scanner.close();
    }
}