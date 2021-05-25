package bdtaskapp.edu.fpdual.controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bdtaskapp.edu.fpdual.conector.Conector;
import bdtaskapp.edu.fpdual.dao.Persona;
import bdtaskapp.edu.fpdual.manager.PersonaManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**
 * Controlador Modificador de usuarios
 * @author Jairo Buendia
 *
 */

public class UsuarioModifyController {

	@FXML
	private SceneController escena = new SceneController();
	
	@FXML
    private TextField codigoID;

    @FXML
    private TextField nickBorrar;

    @FXML
    private Button borrar;

    @FXML
    private TextField nuevoEdad;

    @FXML
    private Button aplicar;

    @FXML
    private TextField nuevoCorreo;

    @FXML
    private TextField nuevoNick;

    @FXML
    private Button Exit;
    

    /**
	 * Nos devuelve a la escena Usuarios
	 * @param event
	 * @throws IOException
	 */
    @FXML
    void handleExit(ActionEvent event) throws IOException {
    	if(event.getSource()==Exit) {
			escena.switchToSceneUsuarios(event);
		}
    }
    
    /**
	 * Borra un Usuario
	 * @param  event
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	@FXML
	public void handleBorrar(ActionEvent event) throws ClassNotFoundException, SQLException {
		
		if(nickBorrar.getText().length()!=0) {
			try {
				Connection con = new Conector().getMySQLConnection();
			new PersonaManager().deleteUsuario(con, nickBorrar.getText());
			con.close();
			AlertType type = AlertType.CONFIRMATION;
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setHeaderText(null);
			alert.setTitle("Borrado completado");
			alert.setContentText("El usuario se ha borrado correctamente.");
			alert.showAndWait();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			AlertType type = AlertType.WARNING;
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Usuario Incorrecto");
			alert.setContentText("El usuario no es correcto , inserte un correcto.");
			alert.showAndWait();
		}
	}
	
	/**
	 * Modifica un usuario existente
	 * @param  event
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws noCaracteresException 
	 */
	@FXML
	public void handleAplicar(ActionEvent event) throws ClassNotFoundException, SQLException, noCaracteresException {
		
		if (codigoID.getText().length()!=0) {
			try {
				Connection con = new Conector().getMySQLConnection();
			new PersonaManager().modifyUsuario(con, nuevoNick.getText(), nuevoEdad.getText(), nuevoCorreo.getText(), codigoID.getText());
			con.close();
			AlertType type = AlertType.CONFIRMATION;
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setHeaderText(null);
			alert.setTitle("Modificado completado");
			alert.setContentText("El usuario se ha modificado correctamente.");
			alert.showAndWait();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			throw new noCaracteresException("NO HAS PUESTO NINGÚN CARÁCTER.");
//			AlertType type = AlertType.WARNING;
//			Alert alert = new Alert(Alert.AlertType.ERROR);
//			alert.setHeaderText(null);
//			alert.setTitle("Código Usuario Incorrecto");
//			alert.setContentText("El código de usuario no es correcto , inserte uno correcto.");
//			alert.showAndWait();
		}
	}

}
