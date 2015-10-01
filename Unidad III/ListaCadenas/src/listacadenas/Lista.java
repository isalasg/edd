/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacadenas;

/**
 *
 * @author Manuel Ignacio Salas Guzmán
 */
public class Lista {
    private Nodo Inicio;
    private Nodo Fin;
    
    public Lista() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public void agregar(String cadena) {
        Nodo mNodo = new Nodo();
        mNodo.setDato(cadena);
        
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
    
    public boolean eliminar(String cadena) {
        boolean borrado = false;
        Nodo mNodo;
        Nodo antNodo;
        
        // Buscando el nodo con el número
        mNodo = this.Inicio;
        while ((mNodo != null) && (!mNodo.getDato().equals(cadena))) {
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

    public boolean modificar(String cadenaanterior, String cadenanueva) {
        boolean modificado = false;
        Nodo mNodo;
        
        // Buscando el nodo con el número
        mNodo = this.Inicio;
        while ((mNodo != null) && (!mNodo.getDato().equals(cadenaanterior))) {
            mNodo = mNodo.getSiguiente();
        }
        
        if (mNodo != null) {
            mNodo.setDato(cadenanueva);
            modificado = true;
        }
        
        return modificado;
    }    
    
    public int contar() {
        Nodo mNodo = Inicio;
        int contador = 0;
        
        while (mNodo != null) {
            mNodo = mNodo.getSiguiente();
            contador++;
        }
        return contador;
    }
    
    public int buscar(String cadena) {
        Nodo mNodo;
        int posicion = 0;
        
        // Buscando el nodo con el número
        if (this.Inicio != null) {
            mNodo = this.Inicio;
            while ((mNodo != null) && (!mNodo.getDato().equals(cadena))) {
                mNodo = mNodo.getSiguiente();
                posicion++;
            }
        } else {
            posicion = -1;
        }
        
        return posicion;
    }
}
