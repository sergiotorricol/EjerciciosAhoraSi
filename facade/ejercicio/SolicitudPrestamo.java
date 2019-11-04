package facade.ejercicio;

public class SolicitudPrestamo {

	private Banco solicitarBanco;
	private Abogado solicitarAbogado;
	private FondoFinanciero solicitarFondoFinanciero;
	private Cooperativa solicitarCooperativa;
	private Arquitecto solicitarArquitecto;
	private Notario solicitarNotario;

	public SolicitudPrestamo(int precio, String date) {
		solicitarBanco = new Banco(precio);
		solicitarAbogado = new Abogado(precio, date);
		solicitarFondoFinanciero = new FondoFinanciero(precio);
		solicitarCooperativa = new Cooperativa(precio);
		solicitarArquitecto = new Arquitecto(precio, date);
		solicitarNotario = new Notario(precio, date);
	}

	public void buscar() {
		solicitarBanco.bancosDispuestos();
		solicitarAbogado.abogadosDispuestos();
		solicitarFondoFinanciero.fondoFinancieroDispuesto();
		solicitarCooperativa.cooperativasDispuestas();
		solicitarNotario.notariosDispuestos();
		solicitarArquitecto.arquitectosDispuestos();
	}

}