package bdtaskapp.edu.fpdual.controler;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * Contralador Inicio
 * @author Jairo Buendia
 *
 */

public class InicioController {

    @FXML
    private Button exit;

    @FXML
    private Button premios;

    @FXML
    private Button tareas;

    @FXML
    private Button usuarios;

    @FXML
    private ImageView users;
    
    @FXML
	private SceneController escena = new SceneController();

    /**
	 * Nos devuelve a la escena de login
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void handleButtonExit(ActionEvent event) throws IOException {
		if (event.getSource() == exit) {
			escena.switchToSceneLogin(event);
		}
	}

	/**
	 * Nos lleva a la escena de Tareas
	 * @param  event
	 * @throws IOException
	 */
	
    @FXML
    void handleButtonTareas(ActionEvent event) throws IOException {
    	if (event.getSource() == tareas) {
    		escena.switchToSceneTareas(event);
		}
    }

    /**
	 * Nos lleva a la escena de Usuarios
	 * @param  event
	 * @throws IOException
	 */
    @FXML
    void handleButtonUsuarios(ActionEvent event) throws IOException {
    	if (event.getSource() == usuarios) {
    		escena.switchToSceneUsuarios(event);
		}
    }

    /**
	 * Nos lleva a la escena de Premios
	 * @param  event
	 * @throws IOException
	 */
    @FXML
    void handleButtonPremios(ActionEvent event) throws IOException {
    	if (event.getSource() == premios) {
    		escena.switchToScenePremios(event);
		}
    }
    
    

}

