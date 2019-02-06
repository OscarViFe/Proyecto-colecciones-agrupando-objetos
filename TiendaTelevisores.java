
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

    /**
     * Constructor for objects of class Tienda
     */
    public TiendaTelevisores()
    {
        numeroIdentificacion = 1;
    }

    /**
     * Permite agregar un nuevo televisor
     */
    public Television AgregarTelevision(String marca, int pulgadas, boolean fhd, String fechaComprado)
    {
        Television nuevaTelevision = new Television(marca, pulgadas, fhd, fechaComprado, numeroIdentificacion);
        numeroIdentificacion ++;
        return nuevaTelevision;
    }
}
