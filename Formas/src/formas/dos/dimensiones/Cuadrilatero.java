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
public class Cuadrilatero {
    private Scanner leer;
    private int base1,base2,altura,area;
    
    public Cuadrilatero(){
        leer=new Scanner(System.in);
        System.out.println("\n\t\\ Area del Cuadrilatero //");
        System.out.println(" Introduzca:");
        System.out.println("Base 1: ");
        base1 = leer.nextInt();
        System.out.println("Base 2: ");
        base2 = leer.nextInt();
        System.out.print("Altura: ");
        altura = leer.nextInt();        
    }
    public void area(){
        area=((base1+base2)*altura)/2;
        System.out.println("\n\nEl area es igual a "+area+" Cm cuadrados.");
    }
}

