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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista mLista = new Lista();
        mLista.agregar(10);
        mLista.agregar(8);
        mLista.agregar(12);
        
        if (mLista.modificar(8,6)) {
            System.out.println("Modificado");
        } else {
            System.out.println("No se puede eliminar");
        }
        if (mLista.modificar(10,9)) {
            System.out.println("Modificado");
        } else {
            System.out.println("No se puede eliminar");
        }
        
        Nodo mNodo = mLista.getInicio();
        while (mNodo != null) {
            System.out.println(mNodo.getDato());
            mNodo = mNodo.getSiguiente();
        }
    }
    
}
