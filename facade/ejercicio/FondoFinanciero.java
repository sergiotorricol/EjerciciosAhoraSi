package facade.ejercicio;

public class FondoFinanciero {

	private int precio;

	public FondoFinanciero(int precio) {
		this.precio = precio;
	}

	public void fondoFinancieroDispuesto() {
		System.out
				.println("Solicitando fondos financieros para el prestamo de Bs." + this.precio + ".");
		if (precio >= 1 && precio <= 10000) {
			System.out.println("Su fondo financiero sera el BNB SAFI.");
		} else if (precio >= 10001 && precio <= 100000) {
			System.out.println("Su cooperativa sera el Bisa SAFI.");
		} else {
			System.out.println("No hay fondos financieros dispuestos a realizar el prestamo.");
		}
	}

}