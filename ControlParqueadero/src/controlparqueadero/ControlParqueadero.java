
package controlparqueadero;

import javax.swing.JOptionPane;

public class ControlParqueadero 
{
   
    Parqueadero parquea = new Parqueadero();

    public void parquearCarro() 
    {
            
            String placa = JOptionPane.showInputDialog(" Placa del carro:");
            if (parquea != null) 
            {
                String marca = JOptionPane.showInputDialog("Marca del carro:");
                String horaeCadena = JOptionPane.showInputDialog("Hora de Entrada:");
                int horae = Integer.parseInt(horaeCadena);
                Carro nuevo = new Carro(placa, marca, horae);
                boolean pudoParquear = parquea.parquearCarro(nuevo);
                if (pudoParquear) 
                {
                   JOptionPane.showMessageDialog(null,"El carro fue parqueado exitosamente.");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"No fue posible parquear el carro. Intente más tarde");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Ya hay un carro parqueado con esa placa.");
            }
    }
       
    public void sacarCarro() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        String hors = JOptionPane.showInputDialog("Hora de salida:");
                
        boolean pudoSacar = parquea.sacarCarro(placa);
        if (pudoSacar) 
        {
            JOptionPane.showMessageDialog(null,"El valor es:");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
    }
    public void info(){
        JOptionPane.showMessageDialog(null, "Autor: Camilo Gaviria","Autor",JOptionPane.PLAIN_MESSAGE);
    }
    
    public void menu() {
        
        int opcion=-1;
        do {
       String valorSeleccionado = 
            JOptionPane.showInputDialog("\t ~|  PARQUEADERO  |~  \n\n" +
                        
                        "1.Parquear un carro    \n" +
                        
                        "2.Sacar un carro   \n" +
                    
                        "3.Info  \n"+
                        
                        "0.Terminar     \n\n" +
                    
                        "Opción : ");
            try 
            {
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                    // Opcion 1: Parquear un carro
                    case 1: parquearCarro();
                            break;
                    // Opcion 2: Sacar un carro del parqueadero y cobrar.
                    case 2: sacarCarro();
                            break;
                            
                    case 3: info();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opción no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser numérico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminación exitosa -");

    }

}