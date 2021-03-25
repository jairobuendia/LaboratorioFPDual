package ejercicios_objetos;

public class Empleado {
	protected String nombre;
	private String empresa;
	private int edad;
	
	
	//Constructor
	
	public Empleado() {
	}
	
	//Métodos
	public void trabajar() {
		System.out.println("Estoy trabajando...");
	}
	
	

	public void descansando() {
		System.out.println("Estoy descansando...");
	}
	public boolean salir() {
		System.out.println("Me toca salir de trabajar o no");
		return true;
	}
}
