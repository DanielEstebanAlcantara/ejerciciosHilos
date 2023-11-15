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
public class SensorHumendad extends Thread {
    
    private int[] humedades;
    public SensorHumendad(){
        this.humedades = new int[10];
    }

    public int[] getHumedad() {
        return humedades;
    }
    
    
    
    private void generarHumedades(){
        Random random = new Random();

       
        for (int i = 1; i <= 9; i++) {
            humedades[i] = random.nextInt(16) + 45;
            
            System.out.println("\tRegistrando\t---->\t\tHumedad[" + i + "] = " + humedades[i] +"%");            
           try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
        System.out.println("Termino el Sensor de Humedad");
    }
    public void run(){
        generarHumedades();
    }
}
