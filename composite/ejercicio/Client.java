package composite.ejercicio;

public class Client {

	public static void main(String[] args) {

		Composite subTask = new Composite("Sub Task");
		subTask.add(new Item(4, "Item 1", "Descripcion 1", "Titulo 1"));

		Composite task = new Composite(" Task ");
		task.add(subTask);

		Composite userStory = new Composite("User Story");

		userStory.add(task);

		userStory.imprimir();

	}

}