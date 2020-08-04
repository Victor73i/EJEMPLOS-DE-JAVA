/*
 * EJEMPLO 1 CALSE ABSTRACTO 

*/
package claseabstracto1;


public class principal {
    public static void main(String [] args){
       planta plantin = new planta();
       animalcarnivoro animalc = new animalcarnivoro();
       animalherviboro animalh = new animalherviboro();
        plantin.alimentarse();
        animalc.alimentarse();
        animalh.alimentarse();
    }
}
