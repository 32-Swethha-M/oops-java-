/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Swethha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner swets=new Scanner (System.in);
        System.out.println("enter your number:");
        int num=swets.nextInt();
        System.out.println("the prime numbers upto" +num+ "is:");
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            
    }
        }  
    }
}
    

    
