/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg5;
import java.util.Scanner;
/**
 *
 * @author Swethha
 */
public class EXERCISE5 {

    /**
     * @param args the command line arguments
     */
    
    // Simulating the "converter" package using a nested static class
    public static class Converter {
        
        // Simulating the "Rates" class inside the "converter" package
        public static class Rates {
            public static final double USD_TO_INR = 83.11;
            public static final double EURO_TO_INR = 88.69;
            public static final double YEN_TO_INR = 0.56;
        }

        public static double dollarToINR(double amount) {
            return amount * Rates.USD_TO_INR;
        }

        public static double euroToINR(double amount) {
            return amount * Rates.EURO_TO_INR;
        }

        public static double yenToINR(double amount) {
            return amount * Rates.YEN_TO_INR;
        }

        public static double inrToDollar(double amount) {
            return amount / Rates.USD_TO_INR;
        }

        public static double inrToEuro(double amount) {
            return amount / Rates.EURO_TO_INR;
        }

        public static double inrToYen(double amount) {
            return amount / Rates.YEN_TO_INR;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Dollar to INR");
        System.out.println("2. Euro to INR");
        System.out.println("3. Yen to INR");
        System.out.println("4. INR to Dollar");
        System.out.println("5. INR to Euro");
        System.out.println("6. INR to Yen");
        int choice = scanner.nextInt();

        System.out.println("Enter the amount:");
        double amount = scanner.nextDouble();

        double result = 0.0;

        switch (choice) {
            case 1:
                result = Converter.dollarToINR(amount);
                break;
            case 2:
                result = Converter.euroToINR(amount);
                break;
            case 3:
                result = Converter.yenToINR(amount);
                break;
            case 4:
                result = Converter.inrToDollar(amount);
                break;
            case 5:
                result = Converter.inrToEuro(amount);
                break;
            case 6:
                result = Converter.inrToYen(amount);
                break;
            default:
                System.out.println("Invalid option!");
                return;
        }

        System.out.println("Converted Amount: " + result);
    }
}
    
    
