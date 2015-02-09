/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import Formas.tres.dimensiones.*;
import Formas.dos.dimensiones.*;
import Formas.una.dimension.*;
import java.util.*;
/**
 *
 * @author cristian gaviria
 */
public class Menu1{
    Scanner leer = new Scanner(System.in);
    int variable,var,var1,var2;
    int volv;
    public Menu1(){
        System.out.println("\n\t\tEscoja una Opcion");
    }
    
        public void menu1(){
            Menu1 mn1 = new Menu1();
            System.out.println("\n\t0. Acerda De.");
    System.out.println("\t1. Una Dimension :");
    System.out.println("\t2. Dos Dimensiones :");
    System.out.println("\t3. Tres Dimensiones :");
    System.out.println("\t4. Salir\n");
    variable = leer.nextInt();
    switch(variable){
        case(0):
     
            System.out.println("  +---------------------------+---------------------------+\n" +
"  |      __________________   |                           |\n" +
"  |  ==c(______(o(______(_()  | |\"\"\"\"\"\"\"\"\"\"\"\"|======[***  |\n" +
"  |             )=\\           | |  EXPLOIT   \\            |\n" +
"  |            // \\\\          | |_____________\\_______    |\n" +
"  |           //   \\\\         | |==[msf >]============\\   |\n" +
"  |          //     \\\\        | |______________________\\  |\n" +
"  |         // RECON \\\\       | \\(@)(@)(@)(@)(@)(@)(@)/   |\n" +
"  |        //         \\\\      |  *********************    |\n" +
"  +---------------------------+---------------------------+\n" +
"  |      o O o                |        \\'\\/\\/\\/'/         |\n" +
"  |              o O          |         )======(          |\n" +
"  |                 o         |       .'  LOOT  '.        |\n" +
"  | |^^^^^^^^^^^^^^|l___      |      /    _||__   \\       |\n" +
"  | |    PAYLOAD     |\"\"\\___, |     /    (_||_     \\      |\n" +
"  | |________________|__|)__| |    |     __||_)     |     |\n" +
"  | |(@)(@)\"\"\"**|(@)(@)**|(@) |    \"       ||       \"     |\n" +
"  |  = = = = = = = = = = = =  |     '--------------'  "
                    + "\n\n\tCristian Camilo Gaviria Ovalle    |\n" +
"  +---------------------------+---------------------------+");
            System.out.println("Desea Regresar? (Si = 1).");
            volv= leer.nextInt();
            if(volv == 1){
            mn1.menu1();
            }else{
            break;
            }
            break;
            
            
            
          case(1):
            System.out.println("\n\nEscoja  el numero de la figura a la cual le desea Hallar el Area.");
            System.out.println("\n\t1. Curva :");
            System.out.println("\t2. Recta :");
            System.out.println("\t3. Regresar :");
            var = leer.nextInt();
            switch(var){
                case(1):
                    Curva cva = new Curva();
                    cva.Area();
                    mn1.menu1();
                                                            
                case(2):
                    Recta rta = new Recta();
                    rta.Longitud();
                    mn1.menu1();
                
                case(3):
                    mn1.menu1();
                    
            }
        break;
        case(2):
            System.out.println("\n\nEscoja  el numero de la figura a la cual le desea Hallar el Area.");
            System.out.println("\n\t1. Cuadrilatero :");
            System.out.println("\t2. Elipse :");
            System.out.println("\t3. Triangulo :");
            System.out.println("\t4. Regresar :");
            var1= leer.nextInt();
            
            switch(var1){
                
                case(1):
                    Cuadrilatero cua = new Cuadrilatero();
                    cua.area();
                    
                    mn1.menu1();
                    
                case(2):
                    Elipse elp = new Elipse();
                    elp.Area();
                    mn1.menu1();
                       
                case(3):
                    Triangulo tg = new Triangulo();
                    tg.Area();
                    mn1.menu1();
                    
                case(4):
                    
                    mn1.menu1();
                    break;
            }
            break;
        case(3):
            System.out.println("\n\nEscoja  el numero de la figura a la cual le desea Hallar el Area.");
            System.out.println("\n\t1. Cilindro :");
            System.out.println("\t2. Cubo :");
            System.out.println("\t3. Esfera :");
            System.out.println("\t4. Regresar :");
            var2 = leer.nextInt();
            switch(var2){
                case(1):
                    Cilindro llamar = new Cilindro();
                    llamar.Area();
                    mn1.menu1();
            
                case(2):
                    Cubo c = new Cubo();
                    c.Area();
                    mn1.menu1();
                
                case(3):
                    Esfera es = new Esfera();
                    es.Area();
                    mn1.menu1();
                    
                case(4):
                    mn1.menu1();
                    break;
                  
            
             
     }
            break;
        case(4):
            System.out.println("\n\n\n\t\t\tLa ejecucion del Programa Finalizo.");
            break;
    }
    
    
}
}
