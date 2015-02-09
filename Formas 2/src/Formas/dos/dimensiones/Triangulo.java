/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas.dos.dimensiones;
import java.util.*;

/**
 *
 * @author cristian gaviria
 */
public class Triangulo {
    private Scanner leer;
    private int base,altura;
    private int area;
    

public Triangulo(){
    System.out.println("  // Area del Triangulo //");
    leer = new Scanner(System.in);
    System.out.println("Introduzca la Base: ");
    base = leer.nextInt();
    System.out.println("Introduzca la Altura: ");
    altura = leer.nextInt();
    
}
public void Area() {
    area = (base * altura)/2;
    System.out.println("El area del Triangulo es: "+area);
    
}


}
