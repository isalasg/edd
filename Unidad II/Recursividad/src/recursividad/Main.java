/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author ManuelIgnacio
 */
public class Main {
    private Interfaz mInterfaz;
    private Calculos mCalculos;
    
    public Main() {
        this.mCalculos = new Calculos();
        this.mInterfaz = new Interfaz();
    }
    
    public void correr() {
        int num;
        int fact;
        
        // Forma ciclica
        this.mInterfaz.pedirNumero();
        num = this.mInterfaz.getNumero();
        fact = this.mCalculos.FactorialC(num);
        this.mInterfaz.imprimirFactorial(fact);
        
        // Forma recursiva
        this.mInterfaz.pedirNumero();
        num = this.mInterfaz.getNumero();
        fact = this.mCalculos.FactorialR(num);
        this.mInterfaz.imprimirFactorial(fact);        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main mMain = new Main();
        mMain.correr();
    }
    
}
