/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author cristian gaviria
 */
public class ProgUsuario {
    
   void imprimeUsuario(Usuario usr)
   {
     //   usr.nombre equivale en este caso a usr.getNombre()
     System.out.println("\nNombre: " + usr.Nombre );
     System.out.println("Edad: " + usr.getEdad() );
     System.out.println("Direccion: " + usr.getDireccion() +"\n");
   }
}
    

