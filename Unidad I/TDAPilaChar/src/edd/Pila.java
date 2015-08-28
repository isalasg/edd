/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author ManuelIgnacio
 */
public class Pila {
    private Nodo Inicio;
    private Nodo Fin;
    
    public Pila() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public void Push(char letra) {
        Nodo mNodo;
        mNodo = new Nodo();
        mNodo.setDato(letra);
        
        if (this.Inicio == null) {
            this.Inicio = mNodo;
        } else {
            this.Fin.setSiguiente(mNodo);
            mNodo.setAnterior(this.Fin);
        }
        this.Fin = mNodo;
    }
    
    public char Pop() {
        char Letra = '@';
        Nodo mNodo;
        
        if (this.Fin != null) {
            mNodo = this.Fin;
            Letra = mNodo.getDato();
            if (this.Inicio != this.Fin) {
                this.Fin = this.Fin.getAnterior();
                this.Fin.setSiguiente(null);
            } else {
                this.Fin = null;
                this.Inicio = null;
            }
        }
        
        return Letra;
    }
}
