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
        System.out.println("  \\ Area de la Elipse //");
        pi = 3.14;
        leer = new Scanner(System.in);
        System.out.println("Introduzca los semiejes: ");
        semiejea=leer.nextInt();
        semiejeb=leer.nextInt();
      
    }
    public void Area(){
        area = pi*semiejea*semiejeb;
        System.out.println("El area es igual a: "+area);
    }
}
