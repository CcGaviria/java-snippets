/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author cristian gaviria
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]= new int [4][4];
        int contador=0;
        
        for(int i = 1;i<4;i++){
            for(int j = 1; j<4;j++){
                matriz[i][j] = contador;
                System.out.println("*");
                contador++;
            }
            System.out.println("");
        }
        // TODO code application logic here
    }
    
}
