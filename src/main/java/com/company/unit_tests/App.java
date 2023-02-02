package com.company.unit_tests;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int result = new SumCalculator().sum(n);
            System.out.println("Sum numbers from 1 to " + n + " equals: " + result + "\n");
            System.out.println("Do you want to continue? (yes or no)");
            boolean isCorrectAnswer = false;
            while (!isCorrectAnswer) {
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Please, enter number");
                    isCorrectAnswer = true;
                } else if (answer.equalsIgnoreCase("no")) {
                    return;
                } else {
                    System.out.println("Please, enter correct answer.");
                }
            }
        }
    }
}
