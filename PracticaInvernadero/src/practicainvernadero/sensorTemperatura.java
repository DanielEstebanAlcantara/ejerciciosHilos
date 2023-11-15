/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainvernadero;
import java.util.Random;
/**
 *
 * @author Propietario
 */
public class sensorTemperatura extends Thread {
    
    private int[] temperaturas;
    
    public sensorTemperatura(){
        this.temperaturas = new int[10];
    }

    public int[] getTemperaturas() {
        return temperaturas;
    }
    
    
    
    private void registroTemperaturas(){
        Random randomTemp = new Random();

        
        for (int i = 1; i <= 9; i++) {
            temperaturas [i] = randomTemp.nextInt(21) + 10;
            
            System.out.println("\tRegistrando\t---->\tTemperatura[ " + i + "] = " + temperaturas [i] +"°C");
            
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
                      
           
        }
        System.out.println("Termino el sensor de temperatura");
        
    }
    
    public void run(){
        registroTemperaturas();    
    }
}
