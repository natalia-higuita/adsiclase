/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;

/**
 *
 * @author JUAN PABLO
 */
public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // declarar  mis objetos
        Neveras neveramay, nevera1;
   
     // instalar mis objetos
     neveramay =new Neveras();
     nevera1=new Neveras("Frigoríficos","negro",800000,"AVE2464NE",23);
     // mostrar resultados
     
     System.out.println("---nevera may --");
     System.out.println( "la marca es: "+neveramay.getMarca ());
     System.out.println("la color es: "+neveramay.getColor());
     System.out.println("la precio es: "+neveramay.getPrecio());
     System.out.println("la referencia es: "+neveramay.getReferencia());
     System.out.println("la capacidad es: "+neveramay.getCapacidad());
     
         
     System.out.println("---nevera may --");
     System.out.println( "la marca es: "+nevera1.getMarca ());
     System.out.println("la color es: "+nevera1.getColor());
     System.out.println("la precio es: "+nevera1.getPrecio());
     System.out.println("la refencia es: "+nevera1.getReferencia());
     System.out.println("la capacidad es: "+nevera1.getCapacidad());
        
    }
    
}

    
    
