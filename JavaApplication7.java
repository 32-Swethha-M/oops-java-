/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author Swethha
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.println("enter the number of author:");
        int n=a1.nextInt();
        String name;
        String email;
        char gender;
        author obj[]=new author[n];
        System.out.println("author");
        for(int i=0;i<n;i++){
            System.out.println("enter the author's name:");
            name=a1.next();
            System.out.println("enter the email:");
            email=a1.next();
            System.out.println("enter the gender:");
            gender=a1.next().charAt(0);
        }
    }
    
}
class author{
    String name;
    String email;
    char gender;
    author(String n,String em,char g){
        name=n;
        email=em;
        gender=g;
    }
}
