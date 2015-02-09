/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas.tres.dimensiones;

import java.util.Scanner;
import java.util.*;

/**
 * @ Bakner Rene
 */
public class Cilindro {
    private Scanner leer;
    private int alt, base, lado3,area;
    double pi;
    
 public Cilindro(){
     pi=3.14;
     System.out.println("\n\t  \\ Area del Cilindro //");
 
     leer = new Scanner(System.in);
     System.out.println("Ingrese Altura = ");
     alt= leer.nextInt();
     System.out.println("Ingrese Base = ");
     base=leer.nextInt();
    
     lado3 = base/2;
     
 }   
 
 public void Area(){
 
 area = (int) (2*pi*lado3*(lado3*alt));
 System.out.println("\n\nEl area es igual a "+area+" Metros cuadrados");
     
 }
    
}
