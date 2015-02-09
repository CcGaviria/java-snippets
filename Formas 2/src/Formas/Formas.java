/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;


import Formas.tres.dimensiones.*;
import Formas.dos.dimensiones.*;
import Formas.una.dimension.*;


/**
 *
 * @ Bakner Rene
 */
public class Formas {

    
    public static void main(String[] args) {
     
        Cilindro llamar = new Cilindro();
        llamar.Area();
        Cubo c = new Cubo();
        c.Area();
        Esfera es = new Esfera();
        es.Area();
        Triangulo tg = new Triangulo();
        tg.Area();
        Elipse elp = new Elipse();
        elp.Area();
        Cuadrilatero cua = new Cuadrilatero();
        cua.area();
    }
    
}
