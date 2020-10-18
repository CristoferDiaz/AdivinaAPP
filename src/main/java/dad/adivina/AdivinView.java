package dad.adivina;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AdivinView  extends VBox  {
	private TextField valorText;
	private Button comprobarButton;
	
	public AdivinView() {
		super();
		
		valorText = new TextField();
		valorText.setPrefColumnCount(5);

		comprobarButton = new Button("Establecer");
		
		setSpacing(5);
		setFillWidth(false);
		setAlignment(Pos.CENTER); 
		getChildren().addAll(new Label("introduce un numero del 1 al 100") ,valorText,comprobarButton );
		
		}
	public TextField getValorText() {
		return valorText;
	}

	public Button getComprobarButton() {
		return comprobarButton;
	}

	

	
}

