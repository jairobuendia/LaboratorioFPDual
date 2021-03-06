package ejemplojdbc.edu.fpdual.conector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conector {

	// Creamos un objeto de la clase Properties
	Properties prop = new Properties();

	public Conector() {

		try {
			// Carga las propiedades del archivo "config.properties"
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Connection getMySQLConnection() {
		try {
			//Indica que driver va a usar JDBC
			Class.forName(prop.getProperty(MySQLConstants.DRIVER));
			
			try {
				//Crea una conexion basada en una URL.
				return DriverManager.getConnection(getURL());
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String getURL() {
		return new StringBuilder().append(prop.getProperty(MySQLConstants.URL_PREFIX))
				.append(prop.getProperty(MySQLConstants.URL_HOST)).append(":")
				.append(prop.getProperty(MySQLConstants.URL_PORT)).append("/")
				.append(prop.getProperty(MySQLConstants.URL_SCHEMA)).append("?user=")
				.append(prop.getProperty(MySQLConstants.USER)).append("&password=")
				.append(prop.getProperty(MySQLConstants.PASSWD)).append("&useSSL=")
				.append(prop.getProperty(MySQLConstants.URL_SSL)).toString();
	}
}
