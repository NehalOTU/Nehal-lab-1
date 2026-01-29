package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = "";
        while (true) {
            System.out.print("Enter first binary: ");
            input1 = sc.nextLine().trim();
            if (input1.matches("[01]+")) break;  // only 0s and 1s allowed
            System.out.println("Invalid input. Please enter a binary number (0 or 1 only).");
        }

        String input2 = "";
        while (true) {
            System.out.print("Enter second binary: ");
            input2 = sc.nextLine().trim();
            if (input2.matches("[01]+")) break;
            System.out.println("Invalid input. Please enter a binary number (0 or 1 only).");
        }

        Binary b1 = new Binary(input1);
        Binary b2 = new Binary(input2);

        System.out.println("Binary 1: " + b1.getValue());
        System.out.println("Binary 2: " + b2.getValue());

        System.out.println("ADD: " + Binary.add(b1, b2).getValue());
        System.out.println("OR: " + Binary.or(b1, b2).getValue());
        System.out.println("AND: " + Binary.and(b1, b2).getValue());
        System.out.println("MULTIPLY: " + Binary.multiply(b1, b2).getValue());
    }
}
