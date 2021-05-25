package bdtaskapp.edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Tabla Persona
 * @author Jairo Buendia
 */
public class Persona {

	public String codUsuario;
	String nick;
	String totalPuntos;
	String edad;
	String correo;
	String contra;
	
	
	//Metodo toString
	
	@Override
	public String toString() {
		return "Persona [codUsuario=" + codUsuario + ", nick=" + nick + ", totalPuntos=" + totalPuntos + ", edad="
				+ edad + ", correo=" + correo + ", contra=" + contra + "]";
	}


	
	//Constructor vacío
	public Persona() {
		super();
	}
	
	//Constructor con todos los parámetros
	
	
	/**
	 * Constructor dao para la tabla Persona
	 * @param result Entrada de tipo ResultSet
	 */
	public Persona(ResultSet result) {
		try {
			this.codUsuario = result.getString("CodUsuario");
			this.nick = result.getString("Nick");
			this.totalPuntos = result.getString("TotalPuntos");
			this.edad = result.getString("Edad");
			this.correo = result.getString("Correo");
			this.contra = result.getString("Contraseña");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	//Getters and setters

	public String getCodUsuario() {
		return codUsuario;
	}



	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}



	public String getNick() {
		return nick;
	}



	public void setNick(String nick) {
		this.nick = nick;
	}



	public String getTotalPuntos() {
		return totalPuntos;
	}



	public void setTotalPuntos(String totalPuntos) {
		this.totalPuntos = totalPuntos;
	}



	public String getEdad() {
		return edad;
	}



	public void setEdad(String edad) {
		this.edad = edad;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getContra() {
		return contra;
	}



	public void setContra(String contra) {
		this.contra = contra;
	}

	

	
	
	
	
	
	
	
	
	
	
}
