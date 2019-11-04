package decorator.ejercicio;

public class Client {

	public static void main(String[] args) {

		ComputadoraPro computadoraPro = new ComputadoraPro(100);
		Computadora computadora = computadoraPro;
		computadora = new Teclado(computadora);
		computadora = new Tarjeta(computadora);
		computadora = new Mouse(computadora);
		computadora = new Monitor(computadora);
		computadora.operation(computadoraPro);

	}

}