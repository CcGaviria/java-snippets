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
        int empleados[] = new int[20];
        int i, lim;
        System.out.println("Ingrese la cantidad de los Empleados");
        lim = teclado.nextInt();
        System.out.println("Ingrese el sueldo para cada Empleado");         
        
        for(i=0;i<lim;i++){                       
            System.out.println("empleado["+(i+1)+"]= ");
            empleados[i] = teclado.nextInt();        
        }
        if(empleados[i]>100 && empleados[i]<300){
            contador = contador + 1;
        
        }
        System.out.println("El mayor es: " +mayor);
                        
        }
        
               
    
    
    }
                   
            
        
        
        
        
        // TODO code application logic here
    
    

