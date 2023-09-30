package comprobacion;
import presentacion.*;

public class check {
    public static void main(String[] args) {
        interfaz.ejecutar(args);
    }
}


/* EJERCICIO 14 
import java.util.ArrayList;
public class check {
    public static void realizarcheck() {
        OPadron padron = new OPadron();
        ArrayList<Habitante> habitantes = padron.gethabitantespadron();
        for(Habitante habitante : habitantes) {
            System.out.println(habitante.getnombre() + " " + habitante.getap1() + " " + habitante.getap2());
        }
        System.out.println("El número total de habitantes es: " + padron.calcularHabitantes());
    }
}
*/
