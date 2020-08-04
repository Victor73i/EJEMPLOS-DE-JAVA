
package interfaz1;


public class bicicleta implements rueda, sillas {

   public bicicleta(){}
    public void avanzar() {
   System.out.println("la bicicleta avanza");
    }

   
    public void detenerse() {
    System.out.println("La bicicleta se detiene");
    }

  
    public void sentarse() {
    System.out.println("La bicicleta tiene una silla");
    }
    
}
