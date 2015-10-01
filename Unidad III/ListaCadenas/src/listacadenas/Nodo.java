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
public class Nodo {
    private String Dato;
    private Nodo Siguiente;
    
    public Nodo() {
        this.Dato = "";
        this.Siguiente = null;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    
    
}
