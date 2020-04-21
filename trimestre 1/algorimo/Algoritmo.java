/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, double definitiva) {
       // voy a declarar variable 
        /*int numero1=5,numero2=3,numero3=1,suma;
        String estudiante;
        Double precio;
        char genero;
       
        suma=numero1+numero2+numero3;
        //Mostrar informacion (Escribir)consola:
        System.out.println("la suma de las tres variables es;"+suma);
        //ventana emergente
        JOptionPane.showMessageDialog(null,"la suma es:"+ suma);
        // capturar el dota ingresedo (leer)
        //consola:importar clase Scanner
       
        
       Scanner leer= new Scanner (System.in);
        System.out.println("por favor ingrese su nombe.");
        estudiante = leer.nextLine();
        System.out.println("el nombre que ingreso es: "+ estudiante );
     */
       /* 
      String nombre;
        nombre = JOptionPane.showInputDialog("Lngrese su nombre:");
    JOptionPane.showMessageDialog(null,"el nombre ingresado es: "+nombre );
      */  
        //cacturar valor por ventana emergente
        /*
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        int suma=n1+n2;
        JOptionPane.showMessageDialog(null, "la suma de los nueros es: "+'\n'+suma);
        */
        /*solicitar elnombre del estudiante y las 3 calificaciones,
        mostrar nombre,defintiva,y avisa si gana o pierde.
        */
        String estudiante;
        Double n1,n2,n3,defintiva;
        estudiante = JOptionPane.showInputDialog("ingrese el nombre del estudiante");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("igrese la nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("igrese la nota 2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("igrese la nota 3"));
        definitiva = (n1+n2+n3)/3;
        JOptionPane.showMessageDialog(null,"el estudiante:"+ estudiante + 
                "tiene una definitiva:" + definitiva );
        if(definitiva>=3) {
            JOptionPane.showMessageDialog(null,"gana");
            }
        else {
            JOptionPane.showMessageDialog(null,"pierde");
            }
        }
        
        
        
        
        
    
      }  
 
    

