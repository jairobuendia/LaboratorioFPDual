package ejercicios_excepciones;

public class ejercicio2 {
	public static void main(String[] args) throws ExcepcionPersonal {

		try {
			System.out.println("Imprimiendo mensajes...");
			throw new ExcepcionPersonal("Error 404...");

		} catch (ExcepcionPersonal e) {
			System.out.println(e.getArgumento());
		} 
	}

}
