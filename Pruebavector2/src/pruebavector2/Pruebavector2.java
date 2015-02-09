/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavector2;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Pruebavector2 {
    private Scanner teclado;
    private float[] alturas;
    private float promedio;
    
public void cargar(){
    teclado=new Scanner(System.in);
    alturas=new float[5];
    
    for (int f=0;f<5;f++ ){
    System.out.println("Ingrese altura:");
    alturas[f] = teclado.nextFloat();
    
    }
}
public void Calcupromedio(){
    float suma=0;
    for (int f=0;f<5;f++ ){
    suma=suma+alturas[f];
    
    }
    promedio= suma/5;
    System.out.println("El promedio es igual a:"+promedio);
}
public void MayoresMenores(){
    int mayores,menores;
        mayores = 0;
        menores = 0;
    for(int f=0;f<5;f++){
        if (alturas[f] >= promedio){
        mayores ++;
    }else{
        if(alturas[f]< promedio){
        menores ++;
        }
        }
    }
    System.out.println("Las alturas mayores al promedio son: "+mayores);
    System.out.println("Las alturas menores al promedio son: "+menores);
}



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Pruebavector2 vect;
            vect=new Pruebavector2();
            vect.cargar();
            vect.Calcupromedio();
            vect.MayoresMenores();

        
        // TODO code application logic here
    }
}
    

