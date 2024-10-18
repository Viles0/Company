package co.edu.politecncointernacional.ClassProject;
import java.util.Scanner;
public class Empresa {
	public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("¿Cuántos trabajadores hay hoy?: ");
            int cantidadTrabajadores = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 1; i <= cantidadTrabajadores; i++) {
                System.out.print("Introduce el nombre del trabajador " + i + ": ");
                String nombre = scanner.nextLine();

                Trabajadores trabajador = new Trabajadores(nombre);
                trabajador.trabajar();
            }
        } finally {
           
            scanner.close();
        }
    }
}


/*Scanner sirve para obtener datos primitivos, nos permite capturar de datos tipo int, double, string, etc*/