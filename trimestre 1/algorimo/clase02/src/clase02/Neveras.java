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
public class Neveras {
    
        // atrbutos 
    private String marca;
    private String color;
     private int precio;
    private String referencia;
    private int capacidad;
    
    //constructores
    public Neveras (){
        this.marca="frost";
         this.color= "gris";
         this.precio=1500000;
         this.referencia= "RMC320FACG";
         this.capacidad= 320 ;
         
    }
    public Neveras(String marca,String color, int precio,String referencia,int capacidad ){
        this.marca=marca;
        this.color=color;
        this.precio=precio;
    this.referencia= referencia;
        this.capacidad=capacidad;
             
    }
    //metodos
    //get
 
   public String getMarca() {
         return marca;
   }
   public String getColor () {
       return color;
   }
     public int  getPrecio () {
         return precio ;
     }
       public String getReferencia () {
         return referencia;
       }
      
         public int getCapacidad () {
         return capacidad;
         }
         
         //set
         
           public void setMarca (String marca ){
            this.marca=marca;
           }
             public void setColor(String color ){
            this.color=color;
             }
               public void setPrecio(int precio ){
            this.precio=precio;
               } 
                   public void setReferencia (String referencia ){
            this.referencia= referencia;
                   }
          
                 public void setCapacidad (int capacidad ){
            this.capacidad= capacidad;
                 }
               
             
}


