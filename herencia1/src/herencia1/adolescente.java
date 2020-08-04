
package herencia1;


public class adolescente extends alumno{
    int edad;
    public adolescente(int edad,String nombre,String horario, String grado){
       super (nombre,horario,grado);
        this.edad=edad;
    }
    public void edad(){
        System.out.println("El adolescente tiene "+this.edad+" (vengo de la clase adolescente)");
    }

  
    }
