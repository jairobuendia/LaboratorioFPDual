package bdtaskapp.edu.fpdual.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

/**
 * Tabla Premio
 * @author Jairo Buendia
 */
public class Premio {
	
	String CodPremio;
	String nombre;
	String PuntosCoste;
	String fecha;
	String edad;
	Persona CodUsuario;
	
	
	//Metodo toString
	
	@Override
	public String toString() {
		return "Premio [CodPremio=" + CodPremio + ", nombre=" + nombre + ", PuntosCoste=" + PuntosCoste + ", fecha="
				+ fecha + ", edad=" + edad + ", CodUsuario=" + CodUsuario + "]";
	}


	//Constructor vacío
	public Premio() {
		super();
	}


	//Constructor con todos los parámetros
	public Premio(ResultSet result) {
		try {
			this.CodPremio = result.getString("CodPremio");
			this.nombre = result.getString("Nombre");
			this.fecha = result.getString("FechaExpi");
			this.PuntosCoste = result.getString("PuntosCoste");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//Getters and setters
	
	public String getCodPremio() {
		return CodPremio;
	}


	public void setCodPremio(String codPremio) {
		CodPremio = codPremio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPuntosCoste() {
		return PuntosCoste;
	}


	public void setPuntosCoste(String puntosCoste) {
		PuntosCoste = puntosCoste;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public Persona getCodUsuario() {
		return CodUsuario;
	}


	public void setCodUsuario(Persona codUsuario) {
		CodUsuario = codUsuario;
	}
	
	
	
	
}
