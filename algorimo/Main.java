/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2026994;

import java.util.Scanner;

/**
 *
 * @author JUAN PABLO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // solicitar nombre y edad
        // mostrar nombre y decir si es menor de edad o mayor
      int ed;
       String nom;
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nom=leer.nextLine();
        System.out.println("ingrese su edad");
        ed=leer.nextInt();
        if (ed>=18){
            System.out.print( "tu nombre es: "+nom+" y eres mayor con la edad de: "+ed);
        }
        else
            System.out.print("tu nombre es: "+nom+"y eres menor con la edad de: "+ed);
    
    
    
    
}

    
    
        
       
    }
    

