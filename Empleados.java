/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Empleados {
    private Scanner teclado;
    private int[] sueldo;
    private int diurno;
    private int noct;
public void cargar(){
    diurno=0;
    noct=0;
    Scanner teclado=new Scanner(System.in);
    sueldo = new int [4];
    for (int f=0;f<4; f++){
        
    System.out.println("-Ingrese el sueldo de los empleados del turno 1: ");
    sueldo[f]= teclado.nextInt();
    diurno=diurno+sueldo[f];
    }
    for (int j=0;j<4;j++){
        System.out.println("-Ingrese el sueldo de los empleados del turno 2: ");
        sueldo[j]=teclado.nextInt();
        noct=noct+sueldo[j];
    }
}
public void imprimir(){
    
    System.out.println("Gastos Diurno: "+diurno);
    

    
    System.out.println("Gastos Nocturno: "+noct);
    
}    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados empl;
        empl=new Empleados();
        empl.cargar();
        empl.imprimir();
        
        
        // TODO code application logic here
    }
    
}
