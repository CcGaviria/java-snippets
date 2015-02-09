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
public class Elipse {
    private Scanner leer;
    private double pi;
    private double semiejea,semiejeb,area;
 
    public Elipse(){
        System.out.println("\n\t\\ Area de la Elipse //");
        pi = 3.14;
        leer = new Scanner(System.in);
        System.out.println("Introduzca la distancia de los Semiejes: ");
        semiejea=leer.nextInt();
        semiejeb=leer.nextInt();
      
    }
    public void Area(){
        area = pi*semiejea*semiejeb;
        System.out.println("\n\nEl area es igual a "+area+" cm cuadrados");
    }
}
