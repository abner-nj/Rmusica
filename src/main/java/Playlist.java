
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 *
 * @author Abner
 */
public class Playlist {
    //arreglo donde se almacena la informacion
    private List<Cancion> canciones= new ArrayList(); 
    
    //metodo para agregar una cancion
    public void agregarCancion (Cancion cancion){
        canciones.add(cancion);
        
    }
    //metodo para eliminar una cancion
    public boolean eliminarCancion(String nombreCancion){
        for (int i = 0; i <canciones.size(); i++) {
            if(canciones.get(i).getTitulo().equals(nombreCancion)){
                canciones.remove(i);  //elimina la cancion
                return true;
            }
        }
        return false;
    }
    
    //metodo para reproducir la siguiente cancion 
    public Cancion reproducirSiguiente(){
        if (canciones.isEmpty()) {
            //regresa vacio si no tiene elementos 
            return null;
            
        }else{
            return canciones.remove(0);
        }
    }
    
    //metodo para ordenar por duracion
    public void ordenarPDuracion(){
        int n = canciones.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (canciones.get(j).getDuracion()> canciones.get(j+1).getDuracion()) {
                    //intercambio de valores
                    Cancion temp = canciones.get(j);
                    canciones.set(j, canciones.get(j+1));
                    canciones.set(j+1, temp);
                }
            }
        }   
    }
    
    //ordenar la lista por nombre del artista 
    public void ordenarPArtista(){
        int n = canciones.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                //comparacion para ordenar
                if (canciones.get(j).getArtista().compareToIgnoreCase(canciones.get(j+1).getArtista())>0) {
                    //intercambio de valores
                    Cancion temp = canciones.get(j);
                    canciones.set(j, canciones.get(j+1));
                    canciones.set(j+1, temp);
                }
            }
        }   
    }
    
    //mostrar la playlist
    public void verlistaReproduccion(){
        System.out.println("-- Lista de Reproduccion --");
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
        System.out.println("");
    }
    
    //metodo para reproducir canciones en aleatorio
    public Cancion reproducAleatorio(){
        if (canciones.isEmpty()) {
            //regresa vacio si no tiene elementos 
            return null;
            
        }else{
            Random rn = new Random(); // para obtener un numero aleatorio
            int n= canciones.size();
            for (int i = n-1; i>0 ; i--) {
                int j= rn.nextInt(i+1);// el numero aleatorio sera entre 0-canciones.size()-1
                Cancion tmp = canciones.get(i);
                canciones.set(i,canciones.get(j));
                canciones.set(j, tmp);
            }
            return canciones.remove(0);
        }
    }
}
