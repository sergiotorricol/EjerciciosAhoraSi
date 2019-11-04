package facade.ejercicio;

public class Notario {

	private int precio;
	private String date;

	public Notario(int precio, String date) {
		this.precio = precio;
		this.date = date;
	}

	public void notariosDispuestos() {
		System.out
				.println("Solicitando notarios para el prestamo de Bs." + this.precio + " durante " + this.date + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su notaria sera Amy.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su notario sera Hermes.");
		} else {
			System.out.println("No hay notarios dispuestos a realizar el trabajo.");
		}
	}

}