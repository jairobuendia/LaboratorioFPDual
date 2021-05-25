package edu.fpdual.mijavafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxSample extends Application {

//	@Override
//	public void start(Stage primaryStage) throws Exception {
//
//		Text textoBienvenida = new Text("Hackeado crack");
//		textoBienvenida.setFont(new Font(35));
//		textoBienvenida.setX(50);
//		textoBienvenida.setY(150);
//
//		Group root = new Group();
//		ObservableList<Node> listaHijos = root.getChildren();
//		listaHijos.add(textoBienvenida);
//
//		Scene scene = new Scene(root, 600, 300);
//
//		scene.setFill(Color.BROWN);
//
//		primaryStage.setTitle("Sample Application JB");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//
//	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creamos el objeto linea
		Line line = new Line();
		line.setStartX(100.0);
		line.setStartY(150.0);
		line.setEndX(500.0);
		line.setEndY(150.0);
		line.setStroke(Color.YELLOW);

		// Creamos un grupo que contenga los objetos
		Group grupo2 = new Group(line);

		// Metemos el grupo en una escena, definimos su altura y anchura
		Scene scene2 = new Scene(grupo2, 600, 300);
		
		//Ponemos un color a la escena
		scene2.setFill(Color.RED);
		
		//Ponemos un titulo a la pestaña
		primaryStage.setTitle("Linea de prueba");
		// Lanzamos la escena
		primaryStage.setScene(scene2);

		// Mostramos la escena
		primaryStage.show();

	}

}
