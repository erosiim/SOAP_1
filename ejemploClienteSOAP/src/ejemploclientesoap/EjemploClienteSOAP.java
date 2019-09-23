package ejemploclientesoap;

import org.ejemplo.Calculadora;
import org.ejemplo.Calculadora_Service;
import org.ejemplo.Persona;

/**
 *
 * @author exkapp
 */
public class EjemploClienteSOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora_Service srv = new Calculadora_Service();
        
        Calculadora calculadora = srv.getCalculadoraPort();
        
        System.out.println(calculadora.suma(5, 5));
        
        Persona p = new Persona();
        p.setClave("dos");
        System.out.println(p.getClave());
    }
}
