package decorator.ejercicio;

public class Monitor extends Decorator {

	private int valorAgregado = 100;

	public Monitor(Computadora computadora) {
		super(computadora);
	}

	public void operation(ComputadoraPro computadoraPro) {
		computadoraPro.setPrecio(computadoraPro.getPrecio() + valorAgregado);
		super.operation(computadoraPro);
		System.out.println("El monitor cuesta: " + valorAgregado + ".");
	}

}