/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Triangulo {

Scanner teclado = new Scanner(System.in);
public int lado1, lado2, lado3;


private void leerdatos(){
  
System.out.println("Ingrese el valor del lado 1");
lado1 = teclado.nextInt();

System.out.println("Ingrese el valor del lado 2");
lado2 = teclado.nextInt();

System.out.println("Ingrese el valor del lado 3");
lado3 = teclado.nextInt();
calculartriangulo(lado1,lado2,lado3);
}
private void calculartriangulo(int l1, int l2, int l3){
    lado1 = l1;
    lado2 = l2;
    lado3 = l3;
    int dif1 = l1 - l2;
    
    int dif2 = l1 - l3;
    
    int dif3 = l2 - l3;
    System.out.println("\n\nLado1: "+l1+"\t Lado2: "+l2+"\t Lado3: "+l3+".");
    
     //Validando que los datos ingresados correspondan a un triangulo          
           if( (l1<=0) || (l2<=0) || (l3<=0) ){
                  System.out.println("Los lados de un triangulo no pueden ser 0 o negativos");         
                  return;
           }
            //Si alguna de las diferencias es cero entonces almenos dos lados son iguales
           if( (dif1==0) || (dif2==0) || (dif3==0) ){
                 //Si todas las diferencias son cero es equilatero, todos los lados iguales
                 if((dif1==0) && (dif2==0) && (dif3==0)) 
                         System.out.println("\nEl Triangulo es Equilatero");
                 else //Sino es Isoceles porque dos lados son iguales pero no tres
                         System.out.println("\nEl Triangulo es Isoceles");
           }else //De lo contrario todos son distintos
              System.out.println("\n\tEl Triangulo es Escaleno");
           
}
public Triangulo(){
 
}
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tr = new Triangulo();
        tr.leerdatos();
        // TODO code application logic here
        }
    
}
