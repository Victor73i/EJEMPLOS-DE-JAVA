
package claseabstracto2;

public abstract class persona {
    String nombre;
    int edad;
  public persona(String nom, int ed){
      this.nombre=nom;
      this.edad=ed;
  }
  public abstract void verdatos();
}
