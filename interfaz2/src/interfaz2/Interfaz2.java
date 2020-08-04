/*
 * EJEMPLO 2 INTERFACES
 */
package interfaz2;

public class Interfaz2 {

   
    public static void main(String[] args) {
       cliente cli= new cliente ("11-1","nom1");
       admin adm= new admin ("usu","pass");
       imprimir impresora = new imprimir(cli);
       
       impresora.imprimirobjetoporimpresora();
       
       imprimir impresora1 = new imprimir(adm);
        impresora1.imprimirobjetoporimpresora();
    }
    
}
