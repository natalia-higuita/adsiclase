/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajojava;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO
 */
public class Trabajojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //declarar variables 
        Zapatos za, za1;
        // instanciar
        za=new Zapatos();
     za1= new Zapatos ("rosado",40000,"SKECHERS",36,"tenis","masculino",16);
       
        // declarar e instanciar 
        Zapatos za2=new Zapatos("gris",35000,"UNISA",20,"chanclas","femenino",4);
        za.setTalla(39);
        za1.setMarca("NIKE");
        
    String col= JOptionPane.showInputDialog("ingrese el color para los  zapatos");   
  za.preguntacolor(col);
  za1.preguntacolor(col);
  za2.preguntacolor(col);
  
  String esti= JOptionPane.showInputDialog("ingrese el estilo para sus zapatos  ");
   za.preguntaestilo(esti);
  za1.preguntaestilo(esti);
  za2.preguntaestilo(esti);
    
  
    // mostrar informacion
    
        System.out.println("--------------ZApatos ---------");
        System.out.println("el color es:  " +za.getColor());
        System.out.println("el precio  es: "+za.getPrecio());
        System.out.println("la marca es: "+za.getMarca());
        System.out.println("la talla es: " +za.getTalla());
        System.out.println("el estilo es: "+za.getEstilo());
        System.out.println("el genero es:  "+za.getGenero());
        System.out.println("la edad es:  "+za.getEdad());
        
        System.out.println("--------------ZApatos 1 ---------");
        System.out.println("el color es:  " +za1.getColor());
        System.out.println("el precio  es: "+za1.getPrecio());
        System.out.println("la marca es: "+za1.getMarca());
        System.out.println("la talla es: " +za1.getTalla());
        System.out.println("el estilo es: "+za1.getEstilo());
        System.out.println("el genero es:  "+za1.getGenero());
        System.out.println("la edad es:  "+za1.getEdad());
        
         System.out.println("--------------ZApatos ---------");
        System.out.println("el color es:  " +za2.getColor());
        System.out.println("el precio  es: "+za2.getPrecio());
        System.out.println("la marca es: "+za2.getMarca());
        System.out.println("la talla es: " +za2.getTalla());
        System.out.println("el estilo es: "+za2.getEstilo());
        System.out.println("el genero es:  "+za2.getGenero());
        System.out.println("la edad es:  "+za2.getEdad());
        
            
}
 
}