/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmult;

/**
 *
 * @author Propietario
 */
public class multiplicacion extends Thread {

    public int multiplicador;
    public int multiplicando;

    public multiplicacion() {
        // System.out.println("\tHijo: Nuevo hilo "+ LocalTime.now() );
    }

    public multiplicacion(int i) {
        // System.out.println("\tHijo: Nuevo hilo "+ LocalTime.now() );
        this.multiplicador = i;
        // return multiplicador;
    }

    public multiplicacion(int i, int j) {
        // System.out.println("\tHijo: Nuevo hilo "+ LocalTime.now() );
        this.multiplicador = i;
        this.multiplicando = j;
    }

    private void generarInfo() {
        // System.out.println("\t" + getName() +" Hola soy el hilo
        // ("+LocalTime.now()+")" );
        System.out.println("\n" + getName() + " Mi nombre es: " + getName() + " Con ID: " + getId());
        for (int k = 1; k < 11; k++) {
            for (int l = 1; l < 11; l++) {
                System.out.println("Estoy multiplicando: " + k + " * " + l + " = " + k * l);

            }
        }
    }

    private void generarInfo2() {
        // System.out.println("\t" + getName() +" Hola soy el hilo
        // ("+LocalTime.now()+")" );
        // System.out.println("\n" + getName() +" Mi nombre es: "+ getName()+ " Con ID:
        // "+getId() );
        for (int k = 1; k < 11; k++) {
            System.out.println(" Mi nombre es: " + getName() + " Con ID: " + getId() + " Estoy multiplicando: "
                    + multiplicador + " * " + k + " = " + multiplicador * k);
        }
    }

    private void generarInfo3() {
        // System.out.println("\t" + getName() +" Hola soy el hilo
        // ("+LocalTime.now()+")" );
        // System.out.println("\n" + getName() +" Mi nombre es: "+ getName()+ " Con ID:
        // "+getId() );
        System.out.println(" Mi nombre es: " + getName() + " Con ID: " + getId() + " Estoy multiplicando: "
                + multiplicador + " * " + multiplicando + " = " + multiplicador * multiplicando);
    }

    public void run() {
        // generarInfo();
        // generarInfo2();
        generarInfo3();
    }
}
