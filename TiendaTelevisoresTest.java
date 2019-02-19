
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TiendaTelevisoresTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TiendaTelevisoresTest
{
    /**
     * Default constructor for test class TiendaTelevisoresTest
     */
    public TiendaTelevisoresTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Commi05()
    {
        TiendaTelevisores tiendaTe1 = new TiendaTelevisores();
    }

    @Test
    public void test2()
    {
    }

    @Test
    public void test02()
    {
        TiendaTelevisores tiendaTe1 = new TiendaTelevisores();
    }

    /**Test para el metodo por insercion**/
    @Test
    public void test07(){
        TiendaTelevisores tiendaTe1 = new TiendaTelevisores();
        tiendaTe1 = new TiendaTelevisores();
        tiendaTe1.agregarTelevision("sony", 17, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 30, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 24, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 15, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 30, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 22, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 20, true, "2000-03-04");
        tiendaTe1.agregarTelevision("sony", 24, true, "2000-03-04");
        assertEquals("Television sony 15 pulgadas 4k Full HD 2000-03-04 identificador: 4\nTelevision sony 17 pulgadas 4k Full HD 2000-03-04 identificador: 1\nTelevision sony 20 pulgadas 4k Full HD 2000-03-04 identificador: 7\nTelevision sony 22 pulgadas 4k Full HD 2000-03-04 identificador: 6\nTelevision sony 24 pulgadas 4k Full HD 2000-03-04 identificador: 3\nTelevision sony 24 pulgadas 4k Full HD 2000-03-04 identificador: 8\nTelevision sony 30 pulgadas 4k Full HD 2000-03-04 identificador: 2\nTelevision sony 30 pulgadas 4k Full HD 2000-03-04 identificador: 5\n", tiendaTe1.getListaOrdenada());
    }
}


