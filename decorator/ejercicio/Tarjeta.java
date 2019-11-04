package decorator.ejercicio;

public class Tarjeta extends Decorator {

	private int valorAgregado = 25;

	public Tarjeta(Computadora computadora) {
		super(computadora);
	}

	public void operation(ComputadoraPro computadoraPro) {
		computadoraPro.setPrecio(computadoraPro.getPrecio() + valorAgregado);
		super.operation(computadoraPro);

		System.out.println("La tarjeta cuesta " + valorAgregado + ".");
	}

}