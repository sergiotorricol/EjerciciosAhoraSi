package decorator.ejercicio;

public class Teclado extends Decorator {

	private int valorAgregado = 100;

	public Teclado(Computadora computadora) {
		super(computadora);
	}

	public void operation(ComputadoraPro computadora) {
		computadora.setPrecio(computadora.getPrecio() + valorAgregado);
		super.operation(computadora);
		System.out.println("El teclado cuesta: " + valorAgregado + ".");
	}

}
