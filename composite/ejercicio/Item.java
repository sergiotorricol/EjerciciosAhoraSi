package composite.ejercicio;

public class Item extends Component {

	public Item(int estimacion, String descripcion, String nombre, String titulo) {
		super(estimacion, nombre, descripcion, titulo);
	}

	@Override
	public void imprimir() {
		System.out.println("\t Item: " + this.getEstimacion() + ".");
	}

	@Override
	public void add(Component component) {
		System.out.println("Not applicable on item.");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Not applicable on item.");
	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Item:" + this.getNombre() + ".");
	}

}