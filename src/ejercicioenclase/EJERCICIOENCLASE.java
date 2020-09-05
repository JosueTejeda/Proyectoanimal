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
public class EJERCICIOENCLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toro toro=new Toro("Pepe","Hervivoro",5) {};
        
        PEZCADO pezcado=new PEZCADO ("Memo","Hueviparo",1) {};
        
        toro.alimentarse();
        toro.corre();
        
        pezcado.alimentarse();
        pezcado.corre();
    }
    
}
