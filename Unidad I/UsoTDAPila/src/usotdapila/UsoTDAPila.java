/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usotdapila;

import edd.Pila;
/**
 *
 * @author ManuelIgnacio
 */
public class UsoTDAPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila mPila = new Pila();
        
        mPila.Push(10);
        mPila.Push(13);
        
        System.out.println(mPila.Pop());
        System.out.println(mPila.Pop());
        System.out.println(mPila.Pop());
    }
    
}
