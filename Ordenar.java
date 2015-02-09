/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Ordenar {
    private int[] sueldos;
    
    public void cargar(){
        Scanner teclado=new Scanner(System.in);    
        sueldos = new int [5];
    for(int k=0;k<4;k++)
        {
            
            
    System.out.println("-Ingrese el sueldo de los empleados: ");
    sueldos[k]= teclado.nextInt();
    
       
    
    }
        }
    
    public void ordenar(){
        for(int k=0;k<4;k++)
        {
            for(int f=0;f<4-k;f++)
            {
                if (sueldos[f]>sueldos[f+1]);{
                            int aux;
                            aux=sueldos[f];
                            sueldos[f] = sueldos[f+1];
                            sueldos[f+1]=aux;
                        }
            }
        }
    }
    public void imprimir(){
        for(int k=0;k<4;k++)
        {
            System.out.println(sueldos[k]);
                
                      }
            
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenar ord;
        ord=new Ordenar();
        ord.cargar();
        ord.ordenar();
        ord.imprimir();
        // TODO code application logic here
    }
    
}
