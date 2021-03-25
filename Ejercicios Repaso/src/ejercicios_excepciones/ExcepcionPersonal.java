package ejercicios_excepciones;

public class ExcepcionPersonal extends Exception {
	
	public String argumento;

	public ExcepcionPersonal(String argumento) {
		this.argumento = argumento;
	}

	public String getArgumento() {
		return argumento;
	}

	
}
