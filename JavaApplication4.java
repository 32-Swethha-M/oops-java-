/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.*;
/**
 *
 * @author Swethha
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner add=new Scanner(System.in);
        int sum=0,n;
        System.out.println("enter the size of the array:");
        n=add.nextInt();
        int a[]=new int[n];  
        for(int i=0;i<n;i++){
            a[i]=add.nextInt();
            sum=sum+a[i];
        }
    System.out.println("the sum of the positive numbers is:"+sum);
    }
    
}
