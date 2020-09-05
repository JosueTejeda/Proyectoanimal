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
public abstract class PEZCADO extends Proyectoanimal {
    
    public PEZCADO(String nombre, String tipo_de_alimentacion, int edad) {
        super(nombre, tipo_de_alimentacion, edad);
    }
    @Override
    public void alimentarse() {
    System.out.println("Me alimento de concentrado para animales acuaticos y plantas acuaticas");
    }

    @Override
    public void corre() {
    System.out.println("Me movilizo con mi aleta trasera y las aletas laterales");
    }
    

}

