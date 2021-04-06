package ejercicios_excepciones;

public class ejercicio1 {
	public static void main(String[] args) throws Exception {

		try {
			System.out.println("Imprimiendo mensajes...");
			throw new Exception("Lanzando error");

		} catch (Exception e) {
			//System.out.println(e.getMessage());
		} finally {
			System.out.println("Siempre pinto");
			System.out.println("Siempre pinto");
			System.out.println("Siempre pinto");
			System.out.println("Siempre pinto");
			System.out.println("Siempre pinto");
		}
	}

	

}
