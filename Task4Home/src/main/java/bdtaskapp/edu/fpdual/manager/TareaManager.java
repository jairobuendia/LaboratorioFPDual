package bdtaskapp.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bdtaskapp.edu.fpdual.dao.Tarea;

/**
 * Manager para la tabla tarea
 * @author Jairo Buendia
 *
 */
public class TareaManager {
	
	/**
	 * @param con Conexion base de datos
	 * @return Todas las tareas
	 */
	public List<Tarea> findAll(Connection con) {
		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT * FROM tarea");
			result.beforeFirst();

			List<Tarea> tareas = new ArrayList<>();

			while (result.next()) {
				tareas.add(new Tarea(result));
			}
			return tareas;
		} catch (SQLException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

}
