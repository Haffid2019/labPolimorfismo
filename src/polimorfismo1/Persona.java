package polimorfismo1;

/**
 *
 * @author Haffid Santiago Niño
 */
public class Persona implements PuedeCantar{
    @Override
    public void cantar() {
        System.out.println("do re mi fa sol la si");
    }
}
