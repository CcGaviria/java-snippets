/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int sueldo;
        int i, lim;
        int rangouno = 0;
        int rangodos = 0;
        int sumasueldos = 0;
        
        System.out.println("Ingrese la cantidad de los Empleados");
        lim = teclado.nextInt();
        System.out.println("Ingrese el sueldo para cada Empleado");         
        
        for(i = 1;i<=lim;i++){                       
            System.out.println("Ingrese el salario del empleado "+i);
            sueldo = teclado.nextInt();        
        
        if(sueldo<100){
            System.out.println("El sueldo ingresado no puede ser menor a 100");
            i= i-1;
        }
        if(sueldo>500){
        System.out.println("El sueldo ingresado no puede ser mayor a 500");
        i = i-1;
        }
        if (sueldo >= 100 && sueldo<300){
            rangouno ++;
        }
        if (sueldo >= 300){
            rangodos++;
        }
        sumasueldos = sumasueldos+sueldo;
                        
        }
        
    System.out.println("Los empleados que tienen salrio mayor a 100 y menor a 300 son: "+rangouno);
    System.out.println("Los empleados que tienen salario mayor a 300 son: "+rangodos);
    System.out.println("La suma de los salarios es igual a: "+sumasueldos);
    System.out.println("El total de salarios ingresados fue igual a: "+lim);
    
    }
}
                   
            
        
        
        
        
        // TODO code application logic here
    
    

