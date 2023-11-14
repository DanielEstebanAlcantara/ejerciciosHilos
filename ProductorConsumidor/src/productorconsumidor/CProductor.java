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
public class CProductor extends Thread {
    private CMensaje mensaje; //último mensaje producido
    
    public CProductor (CMensaje c) {
        mensaje = c;
    }
    
    public void run() {
        int nMsj; //numero de mensaje
        while (true) {
            nMsj = (int)(Math.random()*100); //genera num. de msj
            mensaje.Almacenar(nMsj); //almaena el mensaje
            System.out.println("Productor "+ getName() + "almacena el mensaje #" + nMsj);
            try {
                sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {}
        }
    }
    
}
