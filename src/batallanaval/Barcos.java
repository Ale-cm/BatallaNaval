
package batallanaval;
public class Barcos {
    // atributos
    public int largo;
    private String nombre;
    public int estado; // define si está hundido o activo
    // metodo contructor
    public Barcos(){
        
    }
    // métodos 
    public void recibirdisparo(){
        
    }
    public void hundirse(){
        
    }
    public void moverse(){
        
    }    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    
    @Override
    public String toString(){
    return "Mi nombre de nave es: " + this.nombre;
}
}
