package ejercicios_objetos;

public class Orden {
	
	
	private String ordenPrioridad;
	private String numero;
	private String prioridad;
	private int numeroOrdenes;
	private boolean terminada = false;
	private boolean enPausa = false;
	private String nombreEmpleado;
	private String nombreCliente;
	
	public boolean finalizarOrden() {
		System.out.println("Terminando orden...");
		return this.terminada = true;
	}
	
	public void borrarOrden() {
		System.out.println("Borrando orden " + this.numero + "...");
		this.numero = null;
		System.out.println("Orden borrada con éxito");
	}
	
	public boolean pausar() {
		System.out.println("Pausando orden " + this.numero + "...");
		return this.enPausa=true;
	}
	
	public void modificarOrden(Cliente c1, Empleado e1) {
		System.out.println("Modificando orden...");
		this.nombreCliente = c1.nombre;
		this.nombreEmpleado = e1.nombre;
		System.out.println("Orden " +this.numero+ " actualizada con los datos:\nEmpleado: 		" + this.nombreEmpleado + "\nCliente: " +this.nombreCliente);

	}
	
	
	
}
