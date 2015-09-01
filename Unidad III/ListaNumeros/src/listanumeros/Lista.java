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
    
    public Nodo getInicio() {
        return this.Inicio;
    }
    
    public boolean eliminar(int numero) {
        boolean borrado = false;
        Nodo mNodo;
        Nodo antNodo;
        
        // Buscando el nodo con el número
        mNodo = this.Inicio;
        while ((mNodo != null) && (mNodo.getDato() != numero)) {
            mNodo = mNodo.getSiguiente();
        }
        
        if (mNodo != null) {
            if (mNodo == this.Inicio) {
                this.Inicio = this.Inicio.getSiguiente();
            } else if (mNodo == this.Fin) {
                // Llegar al anterior al fin
                antNodo = this.Inicio;
                while (antNodo.getSiguiente() != mNodo) {
                    antNodo = antNodo.getSiguiente();
                }
                this.Fin = antNodo;
                this.Fin.setSiguiente(null);
            } else {
                // Llengar al anterior al buscado
                antNodo = this.Inicio;
                while (antNodo.getSiguiente() != mNodo) {
                    antNodo = antNodo.getSiguiente();
                }
                antNodo.setSiguiente(mNodo.getSiguiente());
            }
            borrado = true;
        }
        
        return borrado;
    }    

    public boolean modificar(int numeroanterior, int numeronuevo) {
        boolean modificado = false;
        Nodo mNodo;
        
        // Buscando el nodo con el número
        mNodo = this.Inicio;
        while ((mNodo != null) && (mNodo.getDato() != numeroanterior)) {
            mNodo = mNodo.getSiguiente();
        }
        
        if (mNodo != null) {
            mNodo.setDato(numeronuevo);
            modificado = true;
        }
        
        return modificado;
    }    
}
