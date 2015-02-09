/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuesto;
import java.util.*;

/**
 *
 * @author cristian gaviria
 */
public class Impuesto {
    Scanner leer=new Scanner(System.in);
    Scanner lee2=new Scanner(System.in);
    private String[] Nombres;
    private int[] Sueldo;
    private String[] Direccion;
    private int[] Telefono;
    private int[] pago;
    public int salariomin,T,i;
    
    public Impuesto(){
        System.out.println("Introduzca el salario minimo");
        salariomin = leer.nextInt();
        System.out.println("Introduzca la cantidad de personas");
        T = leer.nextInt();
        Nombres = new String[3];
        Direccion = new String[3];
        Telefono = new int[3];
        Sueldo = new int[3];
        pago = new int[3];
        for(i=0;i<T;i++){
            System.out.println("Introduzca el nombre:");
            Nombres[i] = lee2.nextLine();
            System.out.println("Introduzca la direccion:");
            Direccion[i] = lee2.nextLine();
            System.out.println("Introduzca el telefono:");
            Telefono[i] = leer.nextInt();
            System.out.println("Introduzca el Sueldo:");
            Sueldo[i] = leer.nextInt();
            
    }
        }
    public void imprimir(){
        for(i=0;i<T;i++){
            System.out.println(Nombres[i]+", vive en : ["+Direccion[i]+"], Su numero es: ("+Telefono[i]+"). Su salario mensual es de: "+Sueldo[i]);
        }
    }
    public void impuesto(){
        for(i=0;i<T;i++){
            if(Sueldo[i]>salariomin){
                pago[i]=(salariomin*10)/100;
                System.out.println(Nombres[i]+", debe pagar impuesto."+pago[i]);
            }else{
                System.out.println(Nombres[i]+", No debe pagar impuesto.");
            }
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impuesto mostrar;
        mostrar = new Impuesto();
        mostrar.imprimir();
        mostrar.impuesto();
        // TODO code application logic here
    
    
}
}

