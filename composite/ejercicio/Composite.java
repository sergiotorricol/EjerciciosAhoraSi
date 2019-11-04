package composite.ejercicio;

import java.util.ArrayList;

public class Composite extends Component {

	private ArrayList<Component> list = new ArrayList<>();

	private int accEstimacion;

	public Composite(String nombre) {
		super(0, nombre, "", "");
	}

	@Override
	public void imprimir() {
		System.out.println("" + this.getNombre() + " " + this.getEstimacion());
		for (Component component : list) {
			accEstimacion = accEstimacion + component.getEstimacion();
			this.setEstimacion(accEstimacion);
			component.imprimir();
		}
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position).getNombre());
	}

}