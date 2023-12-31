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
public class CMensaje {
    
    private int numMsj;
    private String textoMensaje;
    private boolean disponible = false;
    
    public synchronized void Almacenar(int nmsj) {
        while (disponible == true) {
            //el último mensaje no ha sido mostrado
            try {
                wait(); //se pone a dormir y cede el monitor
            } catch (InterruptedException e) {}
        }
        
        numMsj = nmsj;
        //colocar el código correpondiente para buscar el mensaje
        //en una tabla de mensajes
        textoMensaje = "mensaje ";
        disponible = true;
        notifyAll();
    }
    
    public synchronized String Obtener () {
        String mensaje;
        while (disponible == false) {
            //no hay mensaje
            try {
                wait(); //se pone a dormir y cede el monitor
            } catch (InterruptedException e) {}
        }
        
        disponible = false;
        notifyAll();
        mensaje = textoMensaje + " #" + numMsj;
        return (mensaje);
    }
}
