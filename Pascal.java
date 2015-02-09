/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal;

import java.util.Scanner;

/**
 *
 * @author cristian gaviria
 */
public class Pascal {
    Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pascal tr = new Pascal();
        tr.leerdatos();
          
        // TODO code application logic here
    }

    private void leerdatos() {
        System.out.println("Ingrese la cantidad de filas");
      
         int filas = teclado.nextInt(); //Aquí establecemos número de filas Integer.parseInt(args[0]);
        for(int i =0;i<filas;i++) {

            int dato = 1;

            System.out.format("%"+(filas-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",dato);
                dato = dato * (i - j) / (j + 1);
            }
            System.out.println("");
        }
    }
    
}
