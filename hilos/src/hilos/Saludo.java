/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Propietario
 */
import java.time.LocalTime;

public class Saludo extends Thread{

    
    public Saludo(){
        System.out.println("\tHijo: Nuevo hilo "+ LocalTime.now() );
    }
    
    public Saludo( String nombre, int hilo ){
        System.out.println("\tHijo: Nuevo hilo "+ LocalTime.now() );
        
    }

    public static int getMIN_PRIORITY() {
        return MIN_PRIORITY;
    }

    public static int getNORM_PRIORITY() {
        return NORM_PRIORITY;
    }

    public static int getMAX_PRIORITY() {
        return MAX_PRIORITY;
    }


    private void generarInfo(){
        System.out.println("\tHola soy un hilo ("+LocalTime.now()+")" +
                "\n\tMi nombre es: "+ getName() +
                "\n\tID: "+ getId() +
                "\n\tPrioridad: "+ getPriority() +
                "\n\tEstado: "+ getState() +
                "\n\tGrupo: "+ getThreadGroup() );
        
        System.out.println("\tTermine "+ getName() + ": "+ LocalTime.now() );
    }
    
    private void generarInfo2(){
        System.out.println("\t" + getName() +" Hola soy un hilo ("+LocalTime.now()+")" );
        System.out.println("\n\t" + getName() +" Mi nombre es: "+ getName() );
        System.out.println("\n\t" + getName() +" ID: "+ getId() );
        System.out.println("\n\t" + getName() +" Prioridad: "+ getPriority() );
        System.out.println("\n\t" + getName() +" Estado: "+ getState() );
        System.out.println("\n\t" + getName() +" Grupo: "+ getThreadGroup() );
        System.out.println("\t" + getName() +" Termine "+ getName() + ": "+ LocalTime.now() );
    }
    
    public void run(){
        generarInfo2();
    }
    
    
}
