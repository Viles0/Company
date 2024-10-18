package co.edu.politecncointernacional.ClassProject;
import java.util.Scanner;
public class Trabajadores {
	public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.iniciar();
    }
	 private String nombre;
	    private int cantidadMesas;
	    private int mesasAceptadas;

	    public Trabajadores(String nombre) {
	        this.nombre = nombre;
	        this.cantidadMesas = 0;
	        this.mesasAceptadas = 0;
	    }

	    public void trabajar() {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            
	            System.out.print(nombre + ", ¿cuántas mesas hiciste hoy?: ");
	            cantidadMesas = scanner.nextInt();

	            for (int i = 1; i <= cantidadMesas; i++) {
	                System.out.print("¿Cuánto midió el largo de la mesa " + i + "?: ");
	                double largoMesa = scanner.nextDouble();

	                Mesas mesa = new Mesas(largoMesa);
	                if (mesa.esAceptada()) {
	                    mesasAceptadas++;
	                } else {
	                    System.out.println("Mesa " + i + " descartada.");
	                }
	            }

	            System.out.println(nombre + ", de las " + cantidadMesas + " mesas que hiciste, " + mesasAceptadas + " fueron aceptadas.");
	        } finally {
	            
	            scanner.close();
	        }
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getMesasAceptadas() {
	        return mesasAceptadas;
	    }
	}
/*Scanner sirve para obtener datos primitivos, nos permite capturar de datos tipo int, double, string, etc*/
/*El modificador private sirve  para que cada elemento de la clase que sea privado solo se pueda acceder unicamente por esa clase*/
