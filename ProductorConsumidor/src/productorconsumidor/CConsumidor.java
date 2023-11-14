/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

/**
 *
 * @author Propietario
 */
public class CConsumidor extends Thread{
    private CMensaje mensaje; //último mensaje producido
    
    public CConsumidor (CMensaje c) {
        mensaje = c;
    }
    
    public void run() {
        String Msj; //mensaje a mostrar
        while (true) {
            Msj = mensaje.Obtener(); //obtener el último mensaje
            System.out.println("Consumidor "+ getName() + " obtuvo" + Msj + "\n");
        }
    }
    
}
