/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author ManuelIgnacio
 */
public class Calculos {
    public int FactorialC(int numero) {
        int r;
        int i;
        
        r = 1;
        for (i=1; i<=numero; i++) {
            r = r * i;
        }
        
        return r;
    }
    
    public int FactorialR(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return (numero * FactorialR(numero - 1));
        }
    }
}
