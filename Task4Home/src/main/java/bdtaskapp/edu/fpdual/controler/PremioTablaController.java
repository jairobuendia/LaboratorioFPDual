package bdtaskapp.edu.fpdual.controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bdtaskapp.edu.fpdual.conector.Conector;
import bdtaskapp.edu.fpdual.dao.Premio;
import bdtaskapp.edu.fpdual.manager.PremioManager;
import bdtaskapp.edu.fpdual.manager.TareaManager;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


/**
 * Controlador para la tabla premio
 * @author Jairo Buendia
 *
 */

public class PremioTablaController {
	
	@FXML
	private SceneController escena = new SceneController();

	@FXML
	private Button modify;

	@FXML
	private TextField searchBar;

	@FXML
	private TableView<Premio> tabla;

	@FXML
	private TableColumn<Premio, String> nombreCol;

	@FXML
	private TableColumn<Premio, String> puntosCosteCol;

	@FXML
	private TableColumn<Premio, String> usuarioAsocCol;

	@FXML
	private ChoiceBox<String> box = new ChoiceBox<String>();

	@FXML
	private TableColumn<Premio, String> fechaExpiCol;

	@FXML
	private Button Exit;

	@FXML
	private TableColumn<Premio, String> codPremioCol;

	/**
	 * Nos lleva a la escena Inicio
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handleExit(ActionEvent event) throws IOException {
		if (event.getSource() == Exit) {
			escena.switchToSceneInicio(event);
		}
	}

	/**
	 * Rellena los campos de la TableView
	 * 
	 * @param lista Lista a partir de la que rellenar los campos de la tabla
	 */
	public void makeTable(List<Premio> lista) {
		ObservableList<Premio> listaObservable = FXCollections.observableArrayList(lista);
		tabla.setItems(listaObservable);

		codPremioCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCodPremio()));
		nombreCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
		fechaExpiCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getFecha()));
		puntosCosteCol.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getPuntosCoste()));
		// usuarioAsocCol.setCellValueFactory(c-> new
		// SimpleStringProperty(c.getValue().getCodUsuario()));
	}

	
	/**
	 * Método para que la tabla se inicie
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	@FXML
	public void initialize() throws ClassNotFoundException, SQLException {
		Connection con = new Conector().getMySQLConnection();
		List<Premio> lista = new PremioManager().findAll(con);
		con.close();
		makeTable(lista);
		box.setItems(FXCollections.observableArrayList(
			    "All"));
		box.setValue("All");
	}
	
	@FXML
	void searchBy(ActionEvent event) {

	}

	@FXML
	void handleModify(ActionEvent event) {

	}

}
