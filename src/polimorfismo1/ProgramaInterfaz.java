
package polimorfismo1;

/**
 *
 * @author Haffid Santiago Niño
 */
public class ProgramaInterfaz {

    public static void main(String[] args) {
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro igor = new Burro();
        hacerCantar(igor); 

    }
    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 

}
