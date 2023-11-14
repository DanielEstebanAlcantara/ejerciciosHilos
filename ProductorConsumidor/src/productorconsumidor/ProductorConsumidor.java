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
public class ProductorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creación de los hilos
        CMensaje mensaje = new CMensaje();
        CProductor productor1 = new CProductor(mensaje);
        CConsumidor consumidor1 = new CConsumidor(mensaje);
        
        //ejecución de los hilos
        productor1.start();
        consumidor1.start();
    
}
}

    
