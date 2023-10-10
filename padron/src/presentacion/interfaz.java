package presentacion;
import java.util.ArrayList;
import dominio.*;

public class interfaz extends OPadron {

    static OPadron padron = new OPadron();
    public static boolean ejecutar(String[] instruccion ) { /*string[] instruccion usa una lista formada por strings de los argumentos que pasamos (add nombre ap1 ap2) */
        if(instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1){
            mostrarOPadron(padron);
        }
        else if(instruccion[0].equalsIgnoreCase("add") && instruccion.length == 4){
            padron.add(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        }
        else if (instruccion[0].equalsIgnoreCase("salir") && instruccion.length == 1){
            padron.volcar();
            return false;
        }
        else{
            System.out.println("Error en la instruccion");
        }
        return true;
}
    private static void mostrarOPadron(OPadron padron) {
        ArrayList<Habitante> habitantes = padron.gethabitantespadron();
        for(Habitante habitante : habitantes){
            System.out.println("Habitante: " + habitante.getnombre() + " " + habitante.getap1() + " " + habitante.getap2());
        }
        System.out.println("El numero total de habitantes es : " + padron.calcularHabitantes());
    }
    
}
