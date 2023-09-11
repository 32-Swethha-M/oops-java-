/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Swethha
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Bond[] bonds = new Bond[6];
bonds[0]=new Bond();
bonds[1] = new ConvertibleBond();
bonds[2]=new Bond();
bonds[3] = new ConvertibleBond();
bonds[4]=new Bond();
bonds[5] = new ConvertibleBond();
for(int i=0;i<bonds.length;i++){
bonds[i].display();
}
}
}
class Bond {
public void display() {
System.out.println("Bond");
}
}
class ConvertibleBond extends Bond {
@Override
public void display(){
System.out.println("ConvertibleBond");
}
}
