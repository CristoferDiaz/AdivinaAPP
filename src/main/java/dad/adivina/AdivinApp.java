package dad.adivina;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdivinApp extends Application {

	private AdivinController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new AdivinController();

		Scene adivinScene = new Scene(controller.getView(), 420, 200);

		Stage stage = new Stage();
		stage.setTitle("AdivinAPP");
		stage.setScene(adivinScene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
