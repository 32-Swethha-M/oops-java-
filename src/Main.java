/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg5;

/**
 *
 * @author Swethha
 */
public class Main {
public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessProperties();
    }
}
    class ParentClass {
    protected String protectedProperty = "This is a protected property";
    String defaultProperty = "This is a default property";
}
class ChildClass extends ParentClass {
    public void accessProperties() {
        // Access the protected property (allowed)
        System.out.println(protectedProperty);
        // Access the default property (allowed, as they are in the same package)
        System.out.println(defaultProperty);
        // Attempt to access a private property from the parent class (not allowed)
        // This will result in a compile-time error
        // System.out.println(privateProperty);
    }
}
