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

    private int numeroIdentificacion;

    /**
     * Constructor for objects of class Television
     */
    public Television(int pulgadas, String marca, boolean fhd, String fechaComprado, int numeroIdentificacion)
    {
        // initialise instance variables
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.fhd = fhd;
        this.fechaCompra = fechaCompra;
        fechaCompra = LocalDate.parse(fechaComprado);
        this.numeroIdentificacion = numeroIdentificacion;
        String stringFHD = "";
    }

    /**
     * devuelve el numero de pulgadas del televisor
     */
    public int getPulgadas(){
        return pulgadas;
    }
    
    /**
     * establece el numero de pulgadas del televisor
     */
    public void setPulgadas(int nuevasPulgadas){
        pulgadas = nuevasPulgadas;
    }
    
    /**
     * devuelve la marca del televisor
     */
    public String getMarca(){
        return marca;
    }
    
    /**
     * establece la marca del televisor
     */
    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }
    
    /**
     * devuelve true si el televisor es full hd
     */
    public boolean GetFHD(){
        return fhd;
    }
    
    /**
     * establece que un televisor es full hd
     */
    public void setFHD(){
        fhd = true;
    }
    
    /**
     * devuelve la fecha en la que se compró el televisor
     */
    public LocalDate getFechaCompra(){
        return fechaCompra;
    }
    
    /**
     * establece la fecha en la que se compró el televisor
     */
    public void setFechaCompra(int dia, int mes, int ano){
        fechaCompra = LocalDate.of(ano, mes, dia);
    }
    
    /**
     * convierte el boolean Full HD en una cadena de caracteres que nos dicen en lenguaje hablado silo es o no
     */
    public String stringFHD(){
        String stringFHD = "";
        if (fhd){
            stringFHD = "4k Full HD";
        }
        else{
            stringFHD = "1080p";
        }
        return stringFHD;
    }

    public String getCaracterísticas(){
        String caracteristicas = "";
        caracteristicas = "Television " + marca + " " + pulgadas + " pulgadas " + stringFHD() + " " + fechaCompra + " " + "identificador: " + numeroIdentificacion + "";
        return caracteristicas;
    }
}
