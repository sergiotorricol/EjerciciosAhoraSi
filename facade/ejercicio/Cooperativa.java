package facade.ejercicio;

public class Cooperativa {

	private int precio;

	public Cooperativa(int precio) {
		this.precio = precio;
	}

	public void cooperativasDispuestas() {
		System.out
				.println("Solicitando cooperativas para el prestamo de Bs." + this.precio + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su cooperativa sera Mutual La Paz.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su cooperativa sera La Sagrada Familia.");
		} else {
			System.out.println("No hay cooperativas dispuestas a realizar el prestamo.");
		}
	}

}