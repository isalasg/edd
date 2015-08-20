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
    
    public void Push(int numero) {
        Nodo mNodo;
        mNodo = new Nodo();
        mNodo.setDato(numero);
        
        if (this.Inicio == null) {
            this.Inicio = mNodo;
        } else {
            this.Fin.setSiguiente(mNodo);
        }
        this.Fin = mNodo;
    }
    
    public int Pop() {
        int Numero = -1;
        Nodo mNodo;
        
        if (this.Inicio != null) {
            mNodo = this.Inicio;
            Numero = mNodo.getDato();
            this.Inicio = this.Inicio.getSiguiente();
        }
        
        return Numero;
    }
}