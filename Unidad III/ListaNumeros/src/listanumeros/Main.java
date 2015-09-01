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
    private Lista mLista;
    private Interfaz mInterfaz;
    
    public Main() {
        this.mLista = new Lista();
        this.mInterfaz = new Interfaz();
    }
    
    public void correr() {
        int opc;
        int num;
        int numnuevo;
        
        do {
            this.mInterfaz.imprimirMenu();
            opc = this.mInterfaz.getOpcion();
            
            switch(opc) {
                case 1 : 
                    this.mInterfaz.pedirNumero();
                    num = this.mInterfaz.getNumero();
                    this.mLista.agregar(num);
                    break;
                case 2:
                    this.mInterfaz.pedirNumero("Dame número anterior:");
                    num = mInterfaz.getNumero();
                    this.mInterfaz.pedirNumero("Dame número nuevo:");
                    numnuevo = mInterfaz.getNumero();
                    if (this.mLista.modificar(num, numnuevo)) {
                        this.mInterfaz.imprimirCadena("Número modificado");
                    } else {
                        this.mInterfaz.imprimirCadena("No se puede modificar");
                    }
                    break;
                case 3:
                    this.mInterfaz.pedirNumero("Dame número a borrar:");
                    num = this.mInterfaz.getNumero();
                    if (this.mLista.eliminar(num)) {
                        this.mInterfaz.imprimirCadena("Número eliminado");
                    } else {
                        this.mInterfaz.imprimirCadena("No se puede eliminar");
                    }
                    break;
                case 4:
                    this.mInterfaz.imprimirNumeros(mLista);
                    break;
                case 5:
                    break;
                default:
                    this.mInterfaz.imprimirCadena("Opción no válida");
            }
        } while (opc != 5);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main mMain = new Main();
        mMain.correr();
    }
    
}
