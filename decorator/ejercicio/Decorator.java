package decorator.ejercicio;

public class Decorator implements Computadora {

	private Computadora computadora;

	public Decorator(Computadora computadora) {
		this.computadora = computadora;

	}

	public void operation(ComputadoraPro computadoraPro) {
		computadora.operation(computadoraPro);
	}

}
