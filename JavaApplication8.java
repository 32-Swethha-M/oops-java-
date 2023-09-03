/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.*;
/**
 *
 * @author Swethha
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the author : ");
        String name=obj.next();
        System.out.println("Enter the email : ");
        String email=obj.next();
        System.out.println("Enter the fist letter of gender ('f' or 'm') : ");
        char gender=obj.next().charAt(0);
        
        
    }
    
}

class author{
    private String name,email;
    private char gender;
    
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public char getgender(){
        return gender;
    }
    public String tostring(){
        return "Name = "+name+"\nEmail = "+email+"\nGender = "+gender;
    }
}