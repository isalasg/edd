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
public class Main {
    private Lista mLista;
    private Interfaz mInterfaz;
    
    public Main() {
        this.mLista = new Lista();
        this.mInterfaz = new Interfaz();
    }
    
    public void correr() {
        int opc;
        String cadena;
        String cadenanueva;
        
        do {
            this.mInterfaz.imprimirMenu();
            opc = this.mInterfaz.getOpcion();
            
            switch(opc) {
                case 1 : 
                    this.mInterfaz.pedirCadena();
                    cadena = this.mInterfaz.getCadena();
                    this.mLista.agregar(cadena);
                    break;
                case 2:
                    this.mInterfaz.pedirCadena("Dame cadena anterior:");
                    cadena = mInterfaz.getCadena();
                    this.mInterfaz.pedirCadena("Dame cadena nueva:");
                    cadenanueva = mInterfaz.getCadena();
                    if (this.mLista.modificar(cadena, cadenanueva)) {
                        this.mInterfaz.imprimirCadena("Cadena modificada");
                    } else {
                        this.mInterfaz.imprimirCadena("No se puede modificar");
                    }
                    break;
                case 3:
                    this.mInterfaz.pedirCadena("Dame cadena a borrar:");
                    cadena = this.mInterfaz.getCadena();
                    if (this.mLista.eliminar(cadena)) {
                        this.mInterfaz.imprimirCadena("Cadena eliminada");
                    } else {
                        this.mInterfaz.imprimirCadena("No se puede eliminar");
                    }
                    break;
                case 4:
                    this.mInterfaz.imprimirLista(mLista);
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
