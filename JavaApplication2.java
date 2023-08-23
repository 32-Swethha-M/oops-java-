/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author Swethha
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Odd/Even numbers in the array:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is an even number.");
            } else {
                System.out.println(numbers[i] + " is an odd number.");
            }
        }
        
        scanner.close();
    }
}

