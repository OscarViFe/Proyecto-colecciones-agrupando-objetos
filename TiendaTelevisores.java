
import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class Tienda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TiendaTelevisores
{
    // instance variables - replace the example below with your own
    private int numeroIdentificacion;
    //Cadena que almacena todas las televisiones
    private ArrayList<Television> televisiones;

    /**
     * Constructor for objects of class Tienda
     */
    public TiendaTelevisores()
    {
        numeroIdentificacion = 1;
        televisiones = new ArrayList<Television>();
    }

    /**
     * Permite agregar un nuevo televisor
     */
    public void agregarTelevision(String marca, int pulgadas, boolean fhd, String fechaComprado)
    {
        Television nuevaTelevision = new Television(marca, pulgadas, fhd, fechaComprado, numeroIdentificacion);
        televisiones.add(nuevaTelevision);
        numeroIdentificacion ++;
    }

    /**
     * Permite obtener un String con el listado de los objetos pertenecientes a la colección con todos sus datos
     */
    public String getListadoDeObjetosConDescripcion(){
        String cadenaADevolver = "";
        for(Television televisionActual : televisiones){
            cadenaADevolver += televisionActual + televisionActual.getCaracteristicas() + "\n" + "";
        }
        return cadenaADevolver;
    }

    /**
     * Devuelve una lista de los televisores disponibles ordenados en funcion del número de pulgadas
     */
    public String getListaOrdenada(){
        String cadenaADevolver = "";
        ArrayList<Television> televisionesOrdenadas = new ArrayList<Television>();
        for(Television televisionActual : televisiones){
            televisionesOrdenadas.add(televisionActual);
        }
        int i = 0;
        while(i  < televisionesOrdenadas.size()){
            int j =i;
            Television televisionIntermedia = televisionesOrdenadas.get(i);
            int posicion = i;
            while(j > 0 && televisionesOrdenadas.get(j -1).getPulgadas() > televisionIntermedia.getPulgadas() ){
                posicion = j-1;
                j --;
            }
            if (posicion != i){
                televisionesOrdenadas.add(posicion, televisionIntermedia);
                televisionesOrdenadas.remove(i +1);
            }
            i ++;
        }
        for(Television televisionActual : televisionesOrdenadas){
            cadenaADevolver += televisionActual.getCaracteristicas() + "\n";
        }
        return cadenaADevolver;
    }

    /**
     * Devuelve una lista de los televisores disponibles ordenados en función del número de pulgadas y que además sean marca Sony
     */
    public String getListaOrdenadaConCondicion(){
        String cadenaADevolver = "";
        ArrayList<Television> televisionesOrdenadas = new ArrayList<Television>();
        for(Television televisionActual : televisiones){
            if(televisionActual.getMarca().toLowerCase().equals("sony")){
                televisionesOrdenadas.add(televisionActual);
            }

        }

        for(int contadorLento = 0; contadorLento < televisionesOrdenadas.size() - 1; contadorLento ++){
            for(int contadorRapido = 0; contadorRapido < televisionesOrdenadas.size() - contadorLento -1; contadorRapido ++){
                if(televisionesOrdenadas.get(contadorRapido).getFechaCompra().isBefore(televisionesOrdenadas.get(contadorRapido + 1).getFechaCompra())){
                    Television televisionTemporal = televisionesOrdenadas.get(contadorRapido);
                    televisionesOrdenadas.set(contadorRapido,televisionesOrdenadas.get(contadorRapido + 1));
                    televisionesOrdenadas.set(contadorRapido +1, televisionTemporal);
                }
            }
        }

        for(Television televisionActual : televisiones){
            cadenaADevolver += televisionActual.getCaracteristicas() + "\n";
        }
        return cadenaADevolver;
    }

    public void fijaPulgadas(int numeroIdentificacion, int pulgadas){
        int contador = 0;
        boolean buscando = true;
        while(contador < televisiones.size() && buscando){
            if(televisiones.get(contador).getNumeroIdentificacion() ==numeroIdentificacion){
                televisiones.get(contador).setPulgadas(pulgadas);
                buscando = false;
            }
            contador ++;
        }
    }
}
