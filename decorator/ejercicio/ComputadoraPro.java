package decorator.ejercicio;

public class ComputadoraPro implements Computadora {

	public int precio;

	public ComputadoraPro(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void operation(ComputadoraPro computadoraPro) {
		System.out.println("Computadora Pro con un precio de " + precio + ".");
	}

}