package ejemplojdbc.edu.fpdual.main;

import java.sql.Connection;
import java.sql.SQLException;
import ejemplojdbc.edu.fpdual.conector.Conector;
import ejemplojdbc.edu.fpdual.manager.CityManager;

public class Main {

	public static void main(String[] args) {
		Connection con = new Conector().getMySQLConnection();
		
		//System.out.println(new CityManager().findId(con, 8));
		new CityManager().findAll(con).forEach(city -> System.out.println(city));
		
		
		
		
		
		
		
		
		//Conecta con la base de datos
//		Connection con = new Conector().getMySQLConnection();
//		try {
//			System.out.println(con.getCatalog());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
