/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Ignacio Salas Guzmán
 */
public class Interfaz {
    private String Cadena;
    private int Opcion;
    
    public Interfaz() {
        this.Cadena = "";
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

    public void pedirCadena() {
        this.Cadena = JOptionPane.showInputDialog("Dame cadena:");
    }
    
    public void pedirCadena(String cad) {
        this.Cadena = JOptionPane.showInputDialog(cad);
    }
    public String getCadena() {
        return this.Cadena;
    }

    public int getOpcion() {
        return this.Opcion;
    }
    
    public void imprimirLista(Lista mLista) {
        Nodo mNodo;
        String cad = "";
        
        mNodo = mLista.getInicio();
        while (mNodo != null) {
            cad = cad + mNodo.getDato() + "\n";
            mNodo = mNodo.getSiguiente();
        }
        
        JOptionPane.showMessageDialog(null, cad);
    }
    
    public void imprimirCadena(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
}
