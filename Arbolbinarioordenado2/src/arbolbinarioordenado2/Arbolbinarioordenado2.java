/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinarioordenado2;
import java.util.*;

/**
 *
 * @author cristian gaviria
 */
    
public class Arbolbinarioordenado2 {
    private Scanner teclado;
    class Nodo{
        int info;
        Nodo izq,der;
    }
    Nodo raiz;
    public Arbolbinarioordenado2(){
        raiz=null;
}
    

public void insertar(){
        int info;
        teclado=new Scanner(System.in);
            for(int i=0;i<6;i++){
                System.out.println("Ingrese el valor: ");
                info=teclado.nextInt();
                Nodo nuevo;
                nuevo= new Nodo();
                nuevo.info = info;
                nuevo.izq = null;
                nuevo.der = null;

                    if(raiz==null){
                         raiz=nuevo;

                    }else{
                        Nodo anterior =null,reco;
                        reco=raiz;
                            while(reco!=null){
                                anterior=reco;
                            if(info<reco.info)
                                reco=reco.izq;
                            else
                                reco=reco.der;
                            }
                            if(info<anterior.info)
                                anterior.izq=nuevo;
                            else
                                anterior.der =nuevo;
                    }
            }  
}
private void imprimir(Nodo reco){
    if(reco!=null){
        System.out.println(reco.info+" ");
        imprimir(reco.izq);
        imprimir(reco.der);
    }
}
public void imprimir(){
    imprimir(raiz);
    System.out.println();
}

        
 
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbolbinarioordenado2 ab=new Arbolbinarioordenado2();
        ab.insertar();
        ab.imprimir();
        // TODO code application logic here
    }
    
}
