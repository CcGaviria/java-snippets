/*
 * crear 3 metodos sueldo mayor ,menor y promedio de sueldos
 */
package operarios;
import java.util.*;

/**
 *
 * @author cristian gaviria
 */
public class Operarios {
    Scanner leer = new Scanner(System.in);
    private int[] Sueldos;
    private int i,j;
    public Operarios(){
        System.out.println("Introduzca la cantidad de sueldos que desea ingresar");
        j = leer.nextInt();
        Sueldos = new int[5];
              
        for(i=0;i<j;i++){
            System.out.println("Introduzca el sueldo");
            Sueldos[i] = leer.nextInt();
        }
        
    

    /**
     * @param args the commprivate int[] Sueldosand line arguments
     */ 
    }
    public void imprimir(){
                            
        for(i=0;i<j;i++){
            System.out.println("Los sueldos son:"+Sueldos[i]+".");
        }
        }
    public static void main(String[] args) {
        Operarios mostrar;
        mostrar = new Operarios();
        mostrar.imprimir();
        
         // TODO code application logic = leer.nextInt();
   
    }
}
    

