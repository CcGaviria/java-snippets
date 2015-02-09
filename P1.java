/**
 *Parcial #2
 * @author Cristian Gaviria
 */
package parcial;
import static java.lang.Math.exp;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Parcial #2
 * @author Cristian Gaviria
 */
public class Parcial {
Scanner teclado = new Scanner(System.in);
//int[] listfin = {0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0};

//int[] list1 = {0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0};
// int i=0;
 //String[] ar3;
// int tmo=ar3.length;
   
    public static void main(String[] args) {
 
        
Parcial p = new Parcial();
p.inttobin();
       // p.leerdatos(0);
        // TODO code application logic here
    }

    private double leerdatos(int x,String[] ar3) {
        
            StringBuffer cadena = new StringBuffer();


    for (int w=0;w<ar3.length;w++){
       cadena =cadena.append(ar3[w]);
    }
        
       
         //int[] listf = null;
       // System.out.println(Arrays.toString(ar30));
        System.out.println("Convertimos el String a un Arreglo para Hacer la Modificacionde los Datos\n");
        System.out.println(Arrays.toString(ar3));
            
        System.out.println("\n\nPresione una Tecla para Continuar");
      
        teclado.nextLine();
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int tmo=ar3.length;
        int i = 0;
        if(x==i){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            for(i=0;i<tmo;i++){
            System.out.println(ar3[i]);
            if("1".equals(ar3[i])){
                System.out.println("\nEn la pocision ("+i+") Esta Ocupado: ");
            }
            if("0".equals(ar3[i])){
                System.out.println("\nEn la pocision ("+i+") Esta Libre: ");
            }
            
            System.out.println("\n\n\tQuiere cambiar el estado en esta posicion?");
                
            System.out.println("\n\nEscriba S para Cambiarlo y  N para Mantener!!\n");
            
            String sol2 = teclado.next();
         
            if("S".equals(sol2)){
                System.out.println("\n\n\t(Cambiando...)\n\n");
               
                System.out.println(cambiarestado(i,ar3));
                
                
            }
            if("N".equals(sol2)){
                System.out.println("\n\n\t(ManteniendoCambios...)\n\n");
                 //System.out.println("Los Estados No Cambiaron");
            }
            else
                System.out.println("Ingrese una Respuesta Valida!!");
               
            
        }
              System.out.println("\n\n\tEstado Inicial: \n\t");
              String str = cadena.toString();
                String[] str2 = str.split("");
             System.out.println(Arrays.toString(str2));
              System.out.println("\n\n\tEstado Final: \n\t");
               System.out.println(Arrays.toString(ar3));
          
        
        }
            
        
return 0;   
    }                    

       
       
    
    
    private int cambiarestado(int pos, String[] ar3){
        
       // System.out.println("Aqui en la pos "+pos+" array  "+ar3[pos]);  
       if("0".equals(ar3[pos])){
           // System.out.println("cero");
            ar3[pos]="1";
               
    // System.out.println(Arrays.toString(arrasint));  
      System.out.println(Arrays.toString(ar3));  
            
        }else{
            ar3[pos]="0";
             System.out.println(Arrays.toString(ar3)); 
        }/*
          while(list[pos]==1){
            list[pos]=0;
             int[] listfin = list;
      System.out.println(Arrays.toString(list));  
      System.out.println(Arrays.toString(listfin));  
            
        }*/
      
    return 0;
    }

    private void inttobin() {
        System.out.println("\n\t\t\t PARCIAL # 2 \n\n\n");
        
        System.out.println("\nDescripcion: Programa que recibe un numero entero lo convierte a 16 bits, Con la \n capacidad de cambiar el estado en el numero binario");
          System.out.println("\n\tEstudiante: Cristian Camilo Gaviria Ovalle.");
           System.out.println("\n\tMateria: Programacion Orientada a Objetos ||.");
        
        
        System.out.println("\n\n\t\tPresione una Tecla para Continuar");
      
        teclado.nextLine();
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         String[] ar3 = null;
     
       
         
//  System.out.println ("<esc>]2J");
        System.out.println("Ingrese un valor para convertirlo a binario");
       // System.out.flush();
      //  System.out.close();
    int x = teclado.nextInt();
    System.out.println("\n\nNumero ("+x+") en Binario: \n");
    System.out.println(Integer.toBinaryString(x));
    String s = "";
    while (x > 0)
    {
        s =  ( (x % 2 ) == 0 ? "0" : "1") +s;
        x = x / 2;
    }
  
//System.out.println(s);
    String[] ar = s.split("");
//System.out.println(Arrays.toString(ar));
if(ar.length < 16) {
    int tam1 = ar.length;
    int[] arraybse = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int tam2 = arraybse.length;
    //System.out.println("Tam 1 "+tam1+" Tam 2 "+tam2);
    int ptinicio = tam2 - tam1;
    int ptinicio2 = tam2 - tam1;

    ar3 = new String[tam2];
    int tam3 = ar3.length;
    System.out.println(ar[0]);
    for (int z = 0; z <= ptinicio2; z++) {
        if (z <= tam1) {
            while (ptinicio2 < tam2) {
                ar3[z] = "0";
                z++;
                ptinicio2++;
            }

        }
    }

    for (int i = 0; i <= tam2; i++) {
        int j = 0;

        if (j <= tam1) {
            while (ptinicio < tam2) {
                ar3[ptinicio] = ar[j];
                j++;
                ptinicio++;
            }

        }
    }

    //System.out.println(Arrays.toString(ar3));
}
Parcial p = new Parcial();
p.leerdatos(0,ar3);
    }
    
}
