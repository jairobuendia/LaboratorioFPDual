package ejercicios_objetos;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		Cliente Pepe = new Cliente("Pepe");
		Empleado Manolo = new Empleado();
		Pepe.nombre();
		
		Manolo.salir();
		
		ejercicio7 s1 = new ejercicio7();
		
		s1.imprimir("titulo", "holaqueashe");
	}

}
