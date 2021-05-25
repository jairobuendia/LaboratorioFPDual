package bdtaskapp.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bdtaskapp.edu.fpdual.dao.Premio;

/**
 * Manager para la tabla premio
 * @author Jairo Buendia
 *
 */
public class PremioManager {
	
	/**
	 * @param con Conexion base de datos
	 * @return Todos los premios
	 */
	public List<Premio> findAll(Connection con) {
		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT * FROM premio");
			result.beforeFirst();

			List<Premio> premios = new ArrayList<>();

			while (result.next()) {
				premios.add(new Premio(result));
			}
			return premios;
		} catch (SQLException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

}
