
package interfaz2;


public class cliente  implements imprimable {
    private String rut;
    private String nombre;
   
public cliente (String rut, String nombre){
    this.rut = rut;
    this.nombre= nombre;
    
}
public String getnombre(){
    return nombre;
}
public void setnombre(String nombre){
    this.nombre= nombre;
}
public String getrut(){
    return rut;
}
public void setrut(String rut){
    this.rut=rut;
}

    
    public String imprimir() {
    return this.nombre + " "+ this.rut;
    }

}
