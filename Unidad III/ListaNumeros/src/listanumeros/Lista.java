/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listanumeros;

/**
 *
 * @author isala
 */
public class Lista {
    private Nodo Inicio;
    private Nodo Fin;
    
    public Lista() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public void agregar(int numero) {
        Nodo mNodo = new Nodo();
        mNodo.setDato(numero);
        
        if (this.Inicio == null) {
            this.Inicio = mNodo;
        } else {
            this.Fin.setSiguiente(mNodo);
        }
        this.Fin = mNodo;
    }
}
