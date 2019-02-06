import java.time.LocalDate;
/**
 * Write a description of class Television here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Television
{
    // instance variables - replace the example below with your own
    private int pulgadas;
    
    private String marca;
    
    private boolean fhd;
    
    private LocalDate fechaCompra;
    
    /**
     * Constructor for objects of class Television
     */
    public Television(int pulgadas, String marca, boolean fhd, LocalDate fechaCompra)
    {
        // initialise instance variables
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.fhd = fhd;
        this.fechaCompra = fechaCompra;
    }
}
