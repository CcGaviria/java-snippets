package controlparqueadero;

public class Parqueadero 
{
 
 private Carro[] carros = new Carro[20];

 public boolean parquearCarro(Carro carro) 
 {
  for (int i = 0; i < carros.length; i++) 
  {
   if (carros[i] == null)
   {
    carros[i] = carro;
    return true;
   }
  }
  return false;
 }
 
 public boolean sacarCarro(String placa)
 {
  for (int i = 0; i < carros.length; i++) 
  {
   if (carros[i] != null)
   {
    if (carros[i].getPlaca().equals(placa))
    {
     carros[i] = null;
     return true;
    }
   }
  }
  return false;
 }
}