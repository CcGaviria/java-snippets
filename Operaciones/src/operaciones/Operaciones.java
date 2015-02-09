/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.*;

/**
 *
 * @author cristian gaviria
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main() {
    int a = 0;
    int b = 0;
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Indique un valor para a");
    a=leer.nextInt();
    System.out.println("Indique un valor para b");
    b=leer.nextInt();
    int suma = a + b;
    int multi = a * b;
    int divi = a / b;
    int resta = a - b;
    System.out.println("El valor de la suma es "+suma+", la resta"+resta+",la division"+divi+", la multipicacion"+multi+"." );

        // TODO code application logic here
    }
    
}
