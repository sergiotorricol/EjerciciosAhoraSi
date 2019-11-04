package facade.ejercicio;

public class Arquitecto {

	private int precio;
	private String date;

	public Arquitecto(int precio, String date) {
		this.precio = precio;
		this.date = date;
	}

	public void arquitectosDispuestos() {
		System.out
				.println("Solicitando arquitectos para el prestamo de Bs." + this.precio + " durante " + this.date + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su aquitecto sera Ted.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su arquitecto sera Marshall.");
		} else {
			System.out.println("No hay arquitectos dispuestos a realizar el trabajo.");
		}
	}

}