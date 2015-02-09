package validador;

import java.util.Scanner;

public class Validador {

  


    
   
    public String valor1;
    public int valor2;
    public int x,y;
    public Scanner teclado = new Scanner(System.in);
  

    //constructor por defecto
    public Validador() {
    }

    //constructor con parámetros
    public Validador(String valor1) {
        this.valor1 = valor1;
        
    }


    private void validar(String valor1) {
       
        
      if(Validador.isNumeric(valor1)){
           valor2 = Integer.parseInt(valor1);
            System.out.println("\t\nEl valor ingresado es el numero: "+valor2);
           
        }
        if (valor1.length()<=1 && isNumeric(valor1)==false) {
            System.out.println("\t\nEl valor Ingresado es un Caracter: "  + valor1);
        }
        if(valor1.length() > 1 && isNumeric(valor1)==false){
            System.out.println("\t\nEl valor ingresado es una cadena de caracteres: " + valor1);
        }
    }
     private static boolean isNumeric(String valor1) {
   try {
            Integer.parseInt(valor1);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
       private String leervalor() {
           String dato = "        !!Validador de caracteres, letras y numeros!!                (`.         ,-,\n" +
"                        ` `.    ,;' /\n" +
"                         `.  ,'/ .'\n" +
"                          `. X /.'\n" +
"                .-;--''--.._` ` (\n" +
"              .'            /   `\n" +
"             ,           ` '   Q '\n" +
"             ,         ,   `._    \\\n" +
"          ,.|         '     `-.;_'\n" +
"          :  . `  ;    `  ` --,.._;\n" +
"           ' `    ,   )   .'\n" +
"              `._ ,  '   /_\n" +
"                 ; ,''-,;' ``-\n" +
"                  ``-..__``--`\n" +
"";
           System.out.println(dato);
           System.out.println("\bIngrese la cantidad de datos a validar: ");
       
           y = teclado.nextInt();
           while(y<=0){
               System.out.println("\bRecuerde Ingresar un dato coherente: ");
       
           y = teclado.nextInt();
           }
       
        for(x=0;x<y;x++){
        System.out.println("\t\t\nIngrese un valor: ");
        valor1 = teclado.next();
        validar(valor1);
         

        }
        return valor1;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Validador val = new Validador();
      
       val.validar(val.leervalor());

        // TODO code application logic here
    }
  
}











