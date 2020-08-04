
package claseabstracto2;
import javax.swing.JOptionPane;

public class empleado extends persona {
    double sueldo;
    String telefono, direccion;

    public empleado(String nom, int ed, double suel, String tel, String dir) {
        super(nom, ed);
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;
    }
    @Override
    public void verdatos(){
       JOptionPane.showMessageDialog(null, "NOMBRE: "+ nombre + "\nEDAD: " + edad + "\nTELEFONO: " +telefono +" \nDIRECCION: " + direccion,  "DATOS DEL EMPLEADO ", JOptionPane.INFORMATION_MESSAGE);
    }
}
