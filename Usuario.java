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
public class Usuario {
    String Nombre;
    int edad;
    String Direccion;
    Usuario(){
    Nombre=null;
    edad=0;
    Direccion=null;
    }
    Usuario(String nombre, int edad, String direccion)
     {
        this.Nombre = nombre;
        this.edad = edad;
        this.Direccion = direccion;
     }

     Usuario(Usuario usr)
     {
        Nombre = usr.getNombre();
        edad = usr.getEdad();
        Direccion = usr.getDireccion();
     }

     void setNombre(String n)
     {
        Nombre = n;
     }

     String getNombre()
     {
        return Nombre;
     }

     /* El metodo setEdad() está sobrecargado */
     void setEdad(int e)
     {
        edad = e;
     }

     void setEdad(float e)
     {
        edad = (int)e;
     }

     int getEdad()
     {
        return edad;
     }

     void setDireccion(String d)
     {
        Direccion = d;
     }

     String getDireccion()
     {
        return Direccion;
     }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       ProgUsuario prog = new ProgUsuario();
      /* Se declaran dos objetos de la clase Usuario4 */
      Usuario usr1,usr2;

      /* Se utiliza el constructor por omisión */
      usr1 = new Usuario( );
      prog.imprimeUsuario(usr1);

     /* Se utiliza el segundo constructor de Usuario4 */
      usr2 = new Usuario("Eduardo",24,"Mi direccion");
      prog.imprimeUsuario(usr2);

     /* Se utiliza el tercer constructor de Usuario4 */
      usr1 = new Usuario(usr2);

      usr1.setEdad(50);
      usr2.setEdad(30.45f);
      usr1.setDireccion("Calle 147");

      prog.imprimeUsuario(usr1);
      prog.imprimeUsuario(usr2);

            
        // TODO code application logic here
    }
    

}
