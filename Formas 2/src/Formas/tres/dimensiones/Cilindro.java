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
    
 public Cilindro(){
     System.out.println("  \\ Area del Cilindro //");
 
     leer = new Scanner(System.in);
     System.out.println("Ingre Altura = ");
     alt= leer.nextInt();
     System.out.println("Ingre Base = ");
     base=leer.nextInt();
    
     lado3 = base/2;
     
 }   
 
 public void Area(){
 
 area = (2*3*5*(lado3*alt));
 System.out.println("El area es = "+area);
     
 }
    
}
