package bdtaskapp.edu.fpdual.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

/**
 * Tabla Tarea
 * @author Jairo Buendia
 */

public class Tarea {

	String CodTarea;
	String nombre;
	String fechaRealizar;
	String puntos;
	Persona codUsuario;
	
	@Override
	public String toString() {
		return "Tarea [CodTarea=" + CodTarea + ", nombre=" + nombre + ", fechaRealizar=" + fechaRealizar + ", puntos="
				+ puntos + "]";
	}

	
	//Constructor vacío
	public Tarea() {
		super();
	}

	//Constructor con todos los parámetros
	public Tarea(ResultSet result) {
		try {
			this.CodTarea = result.getString("CodTarea");
			this.nombre = result.getString("Nombre");
			this.fechaRealizar = result.getString("FechaRealizar");
			this.puntos = result.getString("Puntos");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//Getters and setters
	public String getCodTarea() {
		return CodTarea;
	}

	public void setCodTarea(String codTarea) {
		CodTarea = codTarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaRealizar() {
		return fechaRealizar;
	}

	public void setFechaRealizar(String fechaRealizar) {
		this.fechaRealizar = fechaRealizar;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public Persona getCodUsuario() {
		return codUsuario;
	}


	public void setCodUsuario(Persona codUsuario) {
		this.codUsuario = codUsuario;
	}
	
	
	
	
	
	
}
