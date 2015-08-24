/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author ManuelIgnacio
 */
public class Interfaz {
    private int Numero;
    
    public Interfaz() {
        this.Numero = 0;
    }
    
    public void pedirNumero() {
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
    }
    
    public int getNumero() {
        return this.Numero;
    }
    
    public void imprimirFactorial(int factorial) {
        JOptionPane.showMessageDialog(null, "El factorial es: " + factorial);
    }
}
