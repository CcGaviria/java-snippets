/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamulti;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Tablamulti {
    public void convalor (){    
        Scanner teclado = new Scanner(System.in);
        int Valor;
            do{
                System.err.println("Ingrese el valor: ");
                Valor = teclado.nextInt();
                calcular(Valor);
            
            }while(Valor != -1);  
            // TODO code application logic here
    }

public void calcular(int V) {
        for(int f=V; f<=V*10;f=f+V)
        {
            System.out.println(f + "*"+V+"="+f*V);
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablamulti tabla;
        tabla=new Tablamulti();
        tabla.convalor();
    
    
    
    }}

