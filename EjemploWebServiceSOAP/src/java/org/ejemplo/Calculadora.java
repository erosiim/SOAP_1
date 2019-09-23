package org.ejemplo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author exkapp
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "alta")
    public Boolean alta(@WebParam(name = "per") Persona per) {
        //TODO write your implementation code here:
        String sql = "INSERT INTO personas (clave, nombre, direccion) values ('" + per.getClave() +"','" + per.getNombre() +"','" + per.getDireccion() +"');";
        
        return true;
    }
    
    
}
