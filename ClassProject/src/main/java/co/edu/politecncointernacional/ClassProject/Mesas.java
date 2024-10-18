package co.edu.politecncointernacional.ClassProject;

public class Mesas {
	 private double largo;

	    public Mesas(double largo) {
	        this.largo = largo;
	    }

	    public boolean esAceptada() {
	       
	        return largo >= 120 && largo <= 150;
	    }
}
