package ejercicios_objetos;


public class Cliente {
	
	//Atributos
	protected String nombre;
	private String apellidos;
	private int edad;
	private String localidad;
	private String nacionalidad;
	
	//Constructor
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Métodos
	public void comprar() {
		System.out.println("Estoy comprando un servicio...");
	}
	
	public void descansando() {
		System.out.println("Estoy descansando...");
	}
	public void nombre() {
		System.out.println("Me llamo " + this.nombre + " y mi apellidos son: " + 		this.apellidos);
	}
	public boolean salir() {
		System.out.println("He terminado de comprar, me toca salir");
		return true;
	}
	public void precio() {
		System.out.println("El precio es...");
	}
	
	
}
