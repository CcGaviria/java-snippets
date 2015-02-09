package controlparqueadero;

public class Carro 
{
    private String placa;
    private String marca;
    private int horae;
    private String info;
    
    
        
    public Carro(String placa, String marca, int horae) 
    
    {
        this.placa = placa;
        this.marca = marca;
        this.horae = horae;
    }
    
    public String getPlaca() 
    
    {
        return placa;
    }
    
    public String getMarca() 
    
    {
        return marca;
    }

    public int getModelo() 
    
    {
        return horae;
    }   

}