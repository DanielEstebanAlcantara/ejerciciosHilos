/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainvernadero;


/**
 *
 * @author Propietario
 */
public class PracticaInvernadero {

    public static void main(String[] args) {
        SensorHumendad sHumedad = new SensorHumendad();
        sHumedad.setName("Temperatura");
        sensorTemperatura sTemperatura = new sensorTemperatura();
        sTemperatura.setName("Humedad");
            
        
        
        
        System.out.println("Inicia el sensor de "+sHumedad.getName());
        sTemperatura.start();
        System.out.println("Inicia el sensor de "+sTemperatura.getName());
        sHumedad.start();
        
        if(sHumedad.isAlive()){
            System.out.println("main: el hilo "+ sHumedad.getName() + "activo ");
        }
        if(sHumedad.isAlive()){
            System.out.println("main: el hilo "+ sTemperatura.getName() + "activo ");
        }
        
        
        try{
            sTemperatura.join();
            sHumedad.join();
        }catch(Exception e){
        }
        
        int[] temperaturas = sTemperatura.getTemperaturas();
        int[] humedades = sHumedad.getHumedad();
        
        System.out.println("\n--------------------------------------------------------------------\n");
        System.out.println("main: Temperatura promedio =  " + promedio(temperaturas) + "°C");
        System.out.println("main: Humedad minima :" + humedadMinima(temperaturas) + "%");
        System.out.println("main: Humedad maxima fue:" + humedadMaxima(temperaturas) + "%");
        System.out.println("\n--------------------------------------------------------------------\n");
         
            
               
              
        
    }
    public static float promedio(int[] arr){
        float sum = 0.00f;
        
        for(int numero:arr){
            sum += numero;
        }
        return (sum/9);
    }
    
    public static int humedadMaxima(int[] arr){
        int max = 0;
        
        for(int valor:arr){
            max=(valor>max)?valor:max;
        }
        return max;
    }
    public static int humedadMinima(int[] arr){
        int min = 0;
        
        for(int valor:arr){
           if(min == 0){
                min = valor;
            }
           min = (valor<min)?valor:min;                    
        }
        return min;
    }
}
