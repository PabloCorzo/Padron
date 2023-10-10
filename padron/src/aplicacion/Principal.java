package aplicacion;

import java.util.Scanner;
import presentacion.*;



public class Principal {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean resultado;
        do {
        System.out.println("Agregar o mostrar?  ");
        String linea = scanner.nextLine();
        resultado = interfaz.ejecutar(linea.split(" "));
    } while(resultado);
    scanner.close();
}
}
