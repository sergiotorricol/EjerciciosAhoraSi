package composite.ejercicio;

abstract class Component {

	private int estimacion;
	private String descripcion;
	private String nombre;
	private String titulo;

	public Component(int estimacion, String descripcion, String nombre, String titulo) {
		this.estimacion = estimacion;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.titulo = titulo;
		System.out.println("Constructor " + nombre + ".");
	}

	public int getEstimacion() {
		return estimacion;
	}

	public void setEstimacion(int estimacion) {
		this.estimacion = estimacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public abstract void imprimir();

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void getChild(int position);

}