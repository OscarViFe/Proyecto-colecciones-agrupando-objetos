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
    public Television(int pulgadas, String marca, boolean fhd, String fechaComprado)
    {
        // initialise instance variables
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.fhd = fhd;
        this.fechaCompra = fechaCompra;
        fechaCompra = LocalDate.parse(fechaComprado);
    }

    public int getPulgadas(){
        return pulgadas;
    }

    public void setPulgadas(int nuevasPulgadas){
        pulgadas = nuevasPulgadas;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }

    public boolean GetFHD(){
        return fhd;
    }

    public void setFHD(){
        fhd = true;
    }

    public LocalDate getFechaCompra(){
        return fechaCompra;
    }

    public void setFechaCompra(int dia, int mes, int ano){
        fechaCompra = LocalDate.of(ano, mes, dia);
    }
}
