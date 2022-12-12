/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author ASUS
 */
public class TestWS {
    public static void main(String[] args) {
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        
        
        //Utilizar Login
        if(cliente.login("Juan", "juan1234")){
            System.out.println("Credenciales correctas");
        }else{
            System.out.println("Credenciales incorrectas");
        }
        
        //Pago
        if (cliente.procesarPago(5000, 50)!=-1) {
            System.out.println("Pago existoso");
            System.out.println(cliente.procesarPago(5000, 50));
        }else{
            System.out.println("Saldo Insuficinete");
        }
        
        
    }
}
