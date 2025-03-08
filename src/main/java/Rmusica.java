

/**
 *
 * @author Abner
 */
public class Rmusica {

    public static void main(String[] args) {
        Playlist lReproduccion = new Playlist();
        
        //agregar canciones
        
        lReproduccion.agregarCancion(new Cancion("Wake Me Up", "avicii", 260));
        lReproduccion.agregarCancion(new Cancion("Firestone", "kygo", 265));
        lReproduccion.agregarCancion(new Cancion("Counting Stars", "OneRepublic", 267));
        lReproduccion.agregarCancion(new Cancion("The Reason", "Hoobastank", 245));
        lReproduccion.agregarCancion(new Cancion("Love Me Again", "John Newman", 213));
        lReproduccion.agregarCancion(new Cancion(" I Took A Pill In Ibiza", "Mike Posner", 214));
        lReproduccion.agregarCancion(new Cancion("Blinding Lights", "Weeknd", 253));
        
        lReproduccion.verlistaReproduccion();
        
        System.out.println("**Eliminando Counting Stars **");
        lReproduccion.eliminarCancion("Counting Stars");
        lReproduccion.verlistaReproduccion();
        System.out.println("");
        
        System.out.println("Reproduciendo siguiente cancion: " + lReproduccion.reproducirSiguiente());
        System.out.println("");
        
        System.out.println("** Lista ordenada por Duracion **");
        lReproduccion.ordenarPDuracion();
        lReproduccion.verlistaReproduccion();
        
        System.out.println("** Lista ordenada por Artista **");
        lReproduccion.ordenarPArtista();
        lReproduccion.verlistaReproduccion();
        
        System.out.println("** Reproducir en aleatorio **");
        System.out.println("Reproduciendo siguiente cancion: " + lReproduccion.reproducAleatorio());
        lReproduccion.verlistaReproduccion();
        
        System.out.println("** Reproducir en aleatorio **");
        System.out.println("Reproduciendo siguiente cancion: " + lReproduccion.reproducAleatorio());
        lReproduccion.verlistaReproduccion();
        
    }
}
