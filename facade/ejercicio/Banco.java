package facade.ejercicio;

public class Banco {

	private int precio;

	public Banco(int precio) {
		this.precio = precio;
	}

	public void bancosDispuestos() {
		System.out
				.println("Solicitando bancos para el prestamo de Bs." + this.precio + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su banco sera el Banco Bisa.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su banco sera el BNB.");
		} else {
			System.out.println("No hay bancos dispuestos a realizar el prestamo.");
		}
	}

}