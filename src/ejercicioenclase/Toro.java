/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase;

public abstract class Toro extends Proyectoanimal {

    public Toro (String nombre, String tipo_de_alimentacion, int edad) {
        super(nombre, tipo_de_alimentacion, edad);
    }

    public void alimentarse() {
       System.out.println("me alimento de pasto en áreas verdes");
    }

    public void corre() {
        System.out.println("Animal cuadrupelo, camina y correo con 4 patas");
    }
    
}
