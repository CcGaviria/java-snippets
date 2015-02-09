/*

Programa que pide 3 notas y calcula su promedio
 
 */
package notas;
import java.util.*;

/**
 *
 * @author cristian gaviria
 */
public class Notas {
    int[] a = new int[3];
    int total;
    double promedio, valor;
    public void califi(){
        System.out.println("°°Programa para calcular el promedio°°");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las 3 notas Deseadas");
        a[0] = teclado.nextInt();
        a[1] = teclado.nextInt();
        a[2] = teclado.nextInt();
        System.out.println("Ingresa el puntaje total, o máximo: ");       
        total = teclado.nextInt();
        
        
    }
    public void promedio(){
        valor = a[0] + a[1] + a[2];
        System.out.println("La suma de las notas es igual a: "+valor);
        promedio = valor * 100/total;
    }
    public void imprimir(){
        if (promedio < 3.0){
            System.out.println("Perdio");
        }else if(promedio > 3.0){
            System.out.println("Aprobo");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas mostrar;
        mostrar = new Notas();
        mostrar.califi();
        mostrar.promedio();
        mostrar.imprimir();
        
        // TODO code application logic here    }
    
}
}
