
package batallanaval;
public class BatallaNaval {

    public static void main(String[] args) {
       Metodos NuevoMetodo = new Metodos();
        Barcos Lancha = new Barcos(); 
        Lancha.recibirdisparo();
        Lancha.largo = 1;
        Lancha.setNombre("maria");
//        System.out.println(Lancha.getNombre());
//        System.out.println(Lancha.toString());
        
        Jugador Persona = new Jugador();
        Persona.setPuntaje(1500);
        Persona.consultarpuntaje();
//        System.out.println(Persona.toString());
//        NuevoMetodo.cartelito(1500);
//        NuevoMetodo.cartelito("El barco fue hundido");
        
// Instancia de la primer pantalla del juego
        NuevoJuego NN = new NuevoJuego();
        NN.setVisible(true);
        
    }
    
}
