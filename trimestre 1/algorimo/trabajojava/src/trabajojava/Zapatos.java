/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajojava;

/**
 *
 * @author JUAN PABLO
 */
public class Zapatos {
     // Atributos 
    private String color;
    private int precio;
    private String marca;
    private int talla;
    private String estilo;
    private String genero;
    private int edad;
    
    // construcciones 
    
    public Zapatos () {
        
    }
   public Zapatos (String color,int precio,String marca,int talla,String estilo,String genero,int edad){
       this.color= color;
       this.precio=precio;
       this.marca=marca;
       this.talla=talla;
       this.estilo=estilo;
       this.genero=genero;
       this.edad=edad;
   }
   //metodos
     //get:

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getTalla() {
        return talla;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
   
   // set:

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean preguntacolor (String nuecolor){
        boolean respuesta =false;
        if(talla>36){
           color  = nuecolor;
            respuesta = true;
        }
        return respuesta;
    }
       
       
        public boolean preguntaestilo(String nuevoestil){
        boolean respuesta =false;
        if(edad>15){
           color  = "botines";
            respuesta = true;
        }
        
        
        return respuesta;      
        
    }
               
        public boolean preguntamarca(String mar){
        boolean respuesta = false;
        if(edad<12){
          marca = mar;
         respuesta = true;
        }

        return respuesta;
        }   
}