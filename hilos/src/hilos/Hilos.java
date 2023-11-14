/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hilos;

import java.time.LocalTime;

/**
 *
 * @author COMPAX
 */

public class Hilos {
    
    public static void main(String[] args) {
        System.out.println("MAIN: Inicia ejecución "+ LocalTime.now());
        System.out.println(Thread.currentThread().getName() + "  hilos activos");
        Saludo unsaludo = new Saludo();
        unsaludo.setName("HiloA");
        unsaludo.setPriority(Thread.MIN_PRIORITY);
        unsaludo.start();
        
        
        Saludo unsaludo2 = new Saludo("HiloB", Thread.MAX_PRIORITY);
        unsaludo2.start(); 
       
        System.out.println("MAIN: Termina Ejecución "+ LocalTime.now());
    }
}
