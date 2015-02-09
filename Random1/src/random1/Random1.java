/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random1;
import java.util.Random;

/**
 *
 * @author cristian gaviria
 */
public class Random1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Random rnd = new Random();
        a = rnd.nextInt(100);
        b = rnd.nextInt(100);
        c = rnd.nextInt(100); 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // TODO code application logic here
    }
    
}
