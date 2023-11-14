/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmult;
import java.time.LocalTime;

/**
 *
 * @author Propietario
 */
public class TablasMult {

    public static void main(String[] args) {
        /*
        System.out.println("\t\t--- EJERCICIO 14 ---");
        System.out.println("MAIN: Inicia ejecución "+ LocalTime.now());
        Multiplicacion multi1 = new Multiplicacion();
        multi1.setName("Ejercicio14");
        multi1.start();
        System.out.println("MAIN: Termina Ejecución "+ LocalTime.now());
        */
        
        /*
        System.out.println("\n\n\t\t--- EJERCICIO 15 ---");
        System.out.println("MAIN: Inicia ejecución "+ LocalTime.now());
        for( int i = 1; i < 11; i++ ){
            Multiplicacion multi = new Multiplicacion( i );
            multi.setName("Tabla del "+ i);
            multi.start();
        }
        System.out.println("MAIN: Termina Ejecución "+ LocalTime.now());
        */
        
        
        System.out.println("\n\n\t\t--- EJERCICIO 16 ---");
        System.out.println("MAIN: Inicia ejecución "+ LocalTime.now());
        for( int i = 1; i < 11; i++ ){
            for( int j = 1; j < 11; j++ ){
                multiplicacion multi = new multiplicacion( i, j );
                multi.setName( i +" * "+ j+" ");
                multi.start();
            }
        }
        System.out.println("MAIN: Termina Ejecución "+ LocalTime.now());
    }
}

