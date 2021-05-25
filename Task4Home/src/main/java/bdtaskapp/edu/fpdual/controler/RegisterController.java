package bdtaskapp.edu.fpdual.controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import bdtaskapp.edu.fpdual.conector.*;
import bdtaskapp.edu.fpdual.controler.*;
import bdtaskapp.edu.fpdual.manager.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Contralador Registro
 * @author Jairo Buendia
 */

public class RegisterController {

    @FXML
    private PasswordField password;

    @FXML
    private Button back;

    @FXML
    private PasswordField passwordRepeat;

    @FXML
    private Button buttonSubmit;

    @FXML
    private TextField edad;

    @FXML
    private TextField email;

    @FXML
    private TextField username;
    
    @FXML
    private SceneController escena = new SceneController();

    
    /**
   	 * Nos crea el usuario en la base de datos correctamente
   	 * @param event
   	 * @throws IOException
   	 */
    @FXML
    void handleSubmit(ActionEvent event) throws SQLException, ClassNotFoundException {
    	Connection con = new Conector().getMySQLConnection();
		if(email.getText().length()!=0 && email.getText().contains("@")) {
			if(username.getText().length()!=0) {
				if(password.getText().length()!=0&&password.getText().equals(passwordRepeat.getText())) {
					try {
						new PersonaManager().createUsuario(con, email.getText(), username.getText(), password.getText(), edad.getText());
						escena.switchToSceneLogin(event);
						con.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					AlertType type = AlertType.WARNING;
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setHeaderText(null);
					alert.setTitle("Contraseña incorrecta");
					alert.setContentText("Las contraseñas no coinciden, intentélo de nuevo.");
					alert.showAndWait();
				}
			} else {
				AlertType type = AlertType.WARNING;
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Usuario Incorrecto");
				alert.setContentText("El usuario no es correcto , inténtelo de nuevo.");
				alert.showAndWait();
			}
		} else {
			AlertType type = AlertType.WARNING;
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Correo Incorrecto");
			alert.setContentText("Correo incorrecto, no acaba contiene @, inténtelo de nuevo.");
			alert.showAndWait();
		}
    }

    /**
   	 * Nos manda a la escena de Login
   	 * @param event
   	 * @throws IOException
   	 */
    
    @FXML
    void handleBack(ActionEvent event) throws IOException {
    	if(event.getSource()==back) {
			escena.switchToSceneLogin(event);
		}
    }

}
