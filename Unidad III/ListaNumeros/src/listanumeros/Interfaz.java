/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listanumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author isala
 */
public class Interfaz {
    private int Numero;
    private int Opcion;
    
    public Interfaz() {
        this.Numero = 0;
        this.Opcion = 0;
    }
    
    public void imprimirMenu() {
        Opcion = Integer.parseInt(
            JOptionPane.showInputDialog("  M E N U  \n\n"
                    + "1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Mostrar\n"
                    + "5. Salir\n\n"
                    + "Elige opción:"));
    }

    public void pedirNumero() {
        this.Numero = Integer.parseInt(
            JOptionPane.showInputDialog("Dame número:"));
    }
    
    public int getNumero() {
        return Numero;
    }

    public int getOpcion() {
        return Opcion;
    }
    
    public void imprimirNumeros(Lista mLista) {
        Nodo mNodo;
        String cad = "";
        
        mNodo = mLista.getInicio();
        while (mNodo != null) {
            cad = cad + mNodo.getDato() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, cad);
    }
}
