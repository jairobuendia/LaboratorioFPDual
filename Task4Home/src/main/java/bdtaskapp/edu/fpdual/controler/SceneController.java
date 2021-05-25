package bdtaskapp.edu.fpdual.controler;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.stage.Stage;
/**
 * Controlador Escena
 * @author Jairo Buendía
 */
public class SceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	/**
	 * Nos lleva a la escena de login
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/SceneLogin.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Nos lleva a la escena de registro
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneRegister(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/SceneRegister.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * Nos lleva a la escena Inicio
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneInicio(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Inicio.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * Nos lleva a la escena Usuarios
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneUsuarios(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/UsuarioTabla.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * Nos lleva a la escena Modificar Usuario
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneModifyUsuario(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/UsuarioModify.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * Nos lleva a la escena Tareas
	 * @param  event
	 * @throws IOException
	 */
	public void switchToSceneTareas(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/TareaTabla.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	/**
	 * Nos lleva a la escena Premios
	 * @param  event
	 * @throws IOException
	 */
	public void switchToScenePremios(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/PremioTabla.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
