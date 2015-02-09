/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas.tres.dimensiones;

import java.util.Scanner;

/**
 *
 * @Bakner Rene
 */
public class Esfera {
    
    private Scanner leer;
    private int radio,area;
    private double pi;
    
public Esfera(){
    System.out.println("\n\t  \\ Area de la Esfera //");
    pi = 3.14;
    leer = new Scanner(System.in);
    System.out.println("Introduzca el Radio: ");
    radio = leer.nextInt();

}
    
public void Area(){

area = (int) (4*pi*(radio^2));
System.out.println("\n\nEl Area de la esfera es igual a: "+area+ " Metros cuadrados.");

}   
}
