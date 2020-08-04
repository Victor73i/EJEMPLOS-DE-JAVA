
package interfaz2;


public class admin implements imprimable {
  private String usuario;
  private String pass;
  
  public admin(String usuario, String pass){
      this.usuario= usuario;
      this.pass= pass;
      
  } 
  public String getpass(){
      return pass;
  }
  public void setpass(String pass){
      
  this.pass= pass;
}
public String getusuario(){
    return usuario;
}
public void setusuario(String usuario){
    this.usuario=usuario;
}

    @Override
    public String imprimir() {
 return this.usuario + " - " + this.pass;
    }
  
}
