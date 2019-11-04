package facade.ejercicio;

public class Client2 {

	public static void main(String[] args) {

		Banco solicitarBanco;
		Abogado solicitarAbogado;
		FondoFinanciero solicitarFondoFinanciero;
		Cooperativa solicitarCooperativa;
		Arquitecto solicitarArquitecto;
		Notario solicitarNotario;

		solicitarBanco = new Banco(3000);
		solicitarAbogado = new Abogado(3000, "octubre");
		solicitarFondoFinanciero = new FondoFinanciero(3000);
		solicitarCooperativa = new Cooperativa(3000);
		solicitarArquitecto = new Arquitecto(3000, "octubre");
		solicitarNotario = new Notario(3000, "octubre");

		solicitarBanco.bancosDispuestos();
		solicitarArquitecto.arquitectosDispuestos();
		solicitarAbogado.abogadosDispuestos();
		solicitarCooperativa.cooperativasDispuestas();
		solicitarNotario.notariosDispuestos();
		solicitarFondoFinanciero.fondoFinancieroDispuesto();

	}

}