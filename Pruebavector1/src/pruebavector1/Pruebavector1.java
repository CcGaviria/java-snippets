/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavector1;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Pruebavector1 {
    private int[] sueldos;
public void cargar(){
    Scanner ing=new Scanner(System.in);
    sueldos = new int [5];
    for (int f=0;f<5;f++ ){

System.out.println("Ingrese sueldo:");
    sueldos[f] = ing.nextInt();
    }
}
public void imprimir(){
    for (int f=0;f<5;f++ ){

System.out.println(sueldos[f]);
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pruebavector1 vect;
        vect=new Pruebavector1();
        vect.cargar();
        vect.imprimir();
        // TODO code application logic here
    }
    
}
