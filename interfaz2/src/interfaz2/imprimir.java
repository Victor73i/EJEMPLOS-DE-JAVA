
package interfaz2;


public class imprimir {
    private imprimable ob;

    public imprimir(imprimable ob) {
        this.ob = ob;
    }
    
   public void imprimirobjetoporimpresora(){
       System.out.println(this.ob.imprimir());
   }
}
