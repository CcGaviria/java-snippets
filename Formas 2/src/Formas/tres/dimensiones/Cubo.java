/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas.tres.dimensiones;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @BAkner Rene
 */
public class Cubo {
    
    private Scanner leer;
    private int area, arista;
    
    
public Cubo(){
    System.out.println("  \\ Area del Cubo //");
    leer = new Scanner(System.in);

  System.out.println("Ingrese la Arista = "+arista);
  arista = leer.nextInt();

}

public void Area() {
    
    area = 6*(arista^2); 
    System.out.println("el Area es = "+area);

}

}
