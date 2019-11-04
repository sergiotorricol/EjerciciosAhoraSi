package decorator.ejercicio;

public class Mouse extends Decorator {

	private int costoAgregado = 100;

	public Mouse(Computadora computadora) {
		super(computadora);
	}

	public void operation(ComputadoraPro computadoraPro) {
		computadoraPro.setPrecio(computadoraPro.getPrecio() + costoAgregado);
		super.operation(computadoraPro);
		System.out.println("Un mouse cuesta " + costoAgregado + ".");
	}

}