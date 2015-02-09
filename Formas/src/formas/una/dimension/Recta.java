/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas.una.dimension;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Recta {
    private Scanner leer;
    private int longitud,puntoA,puntoB;
    
    public Recta(){
    leer = new Scanner (System.in);
     System.out.println("\n\t  \\ Area de la Recta //");
            System.out.println("Ingrese punto A:");
            puntoA=leer.nextInt();
            System.out.println("Ingrese punto B");
            puntoB=leer.nextInt();
            
}
    public void Longitud(){
        longitud = (puntoB-puntoA);
        
        System.out.println("\n\nLa longitud de la recta es igual a "+longitud);
    
}
}
