/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Mayormenor {
    
    public void cargarvalor(){
        int valor1;
        int valor2;
        int valor3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        valor1=teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        valor2=teclado.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        valor3=teclado.nextInt();
        int mayor;
        int menor;
        mayor=Calcumayor(valor1,valor2,valor3);
        System.out.println("El valor mayor es : "+mayor);
        menor=Calcumenor(valor1,valor2,valor3);
        System.out.println("El valor menor es : "+menor);
    }
    public int Calcumayor(int v1,int v2,int v3){
        int m;
        if (v1>v2 && v1>v3){
            m=v1;
        }else{
            if(v2 > v3){
            m=v2;
            }else{
                m=v3;
            }
                
            }
        return(m);
        }
    public int Calcumenor(int v1,int v2, int v3){
        int me;
        if (v1<v2 && v1<v3){
            me=v1;
        }else{
            if(v2 < v3){
            me=v2;
            }else{
                me=v3;
            }
                
            }
        return(me);
        }
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Mayormenor mayme;
            mayme=new Mayormenor();
            mayme.cargarvalor();
            
        // TODO code application logic here
    }
    
}
