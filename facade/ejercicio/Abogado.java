package facade.ejercicio;

public class Abogado {

	private int precio;
	private String date;

	public Abogado(int precio, String date) {
		this.precio = precio;
		this.date = date;
	}

	public void abogadosDispuestos() {
		System.out
				.println("Solicitando abogados para el prestamo de Bs." + this.precio + " durante " + this.date + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su abogado sera Anthony.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su abogado sera Peter.");
		} else {
			System.out.println("No hay abogados dispuestos a realizar el trabajo.");
		}
	}

}