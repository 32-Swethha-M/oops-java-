/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author Swethha
 */
import java.util.Scanner;

public class javaapplication20  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handling ArithmeticException
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int index = 4; // Accessing an element outside the array bounds
            int value = numbers[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Handling NumberFormatException
        try {
            System.out.print("Enter a number: ");
            String input = scanner.next();
            int number = Integer.parseInt(input); // Parsing a non-integer string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // Handling StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            char ch = str.charAt(10); // Accessing a character beyond the string length
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

        scanner.close();
    }
}

