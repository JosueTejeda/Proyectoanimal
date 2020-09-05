/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase;

/**
 *
 * @author Josué Tejeda
 */
public abstract class Proyectoanimal {
    private String nombre; 
private String tipo_de_alimentacion;
private int edad;  

public Proyectoanimal (String nombre, String tipo_de_alimentacion,int edad){
    this.nombre=nombre;
    this.tipo_de_alimentacion=tipo_de_alimentacion;
    this.edad=edad;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_de_alimentacion() {
        return tipo_de_alimentacion;
    }

    public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
public abstract void alimentarse ();

public abstract void corre ();
}
