
package herencia1;

public class alumno {
    String nombre;
    String horario;
    String gradoescolar;
    
    public alumno (String nombre, String horario, String grado){
        this.nombre=nombre;
        
        this.gradoescolar=grado;
        this.horario=horario;
    }
    public void estudio(){
        System.out.println(this.nombre+"  Estudia en  "+this.gradoescolar+"  (se esta heredando de la clase alumno)");
    }
    public void asistirclase(){
        System.out.println("El alumno asiste a sus clases"+this.horario+"  (vengo desde la clase alumno)");
        
    }
}
