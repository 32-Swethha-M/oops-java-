/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.*;
/**
 *
 * @author Swethha
 */

public class  javaapplication21{

    // ScoreException class definition
    static class ScoreException extends Exception {
        public ScoreException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        
        int[] studentIDs = new int[n];
        int[] scores = new int[n];

        System.out.println("Enter " + n + " student IDs:");
        for (int i = 0; i < n; i++) {
            studentIDs[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter score for student ID: " + studentIDs[i]);
            try {
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score. Score should be between 0 and 100.");
                }
                scores[i] = score;
            } catch (ScoreException se) {
                System.out.println(se.getMessage());
                scores[i] = 0;
            }
        }

        System.out.println("\nStudent IDs and their scores:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student ID: " + studentIDs[i] + " | Score: " + scores[i]);
        }
    }
}
