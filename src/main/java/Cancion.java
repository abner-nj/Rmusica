

/**
 *
 * @author Abner
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;  //duracion de la cancion en segundos 

    //constructor
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }
    // gets sirve para obtener el dato
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }
    
    // sets sirve para modificar un dato 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //metodo para poder ver la informacion al imprimir
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + '}';
    }
}
