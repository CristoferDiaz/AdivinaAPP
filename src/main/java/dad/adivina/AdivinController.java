package dad.adivina;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.util.converter.NumberStringConverter;

public class AdivinController {

	private AdivinModel model = new AdivinModel();
	private AdivinView view = new AdivinView();
	private int resultado  = (int)( Math.random() *100);


	public AdivinController() {
		view.getValorText().textProperty().bindBidirectional(model.valorProperty(), new NumberStringConverter());

		view.getComprobarButton().setOnAction(e -> onComprobarAction(e));

	}
	

	public AdivinModel getModel() {
		return model;
	}


	public void setModel(AdivinModel model) {
		this.model = model;
	}


	public AdivinView getView() {
		return view;
	}


	public void setView(AdivinView view) {
		this.view = view;
	}


	private void onComprobarAction(ActionEvent e) {
		System.out.println(resultado);
		
		if (model.valorProperty().getValue()<0||model.valorProperty().getValue()>100) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("AdivinAPP");
			alert.setHeaderText("Error");
			alert.setContentText("El numero introducido no es valido");
			alert.showAndWait();
			
		}else if (model.valorProperty().getValue()<resultado) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("AdivinAPP");
			alert.setHeaderText("Has fallado");
			alert.setContentText("El numero a adivinar es mallor que "+ model.valorProperty().getValue());

			alert.showAndWait();
			
			model.setIntentos(model.getIntentos()+1);
		}else if (model.valorProperty().getValue()>resultado) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("AdivinAPP");
			alert.setHeaderText("Has fallado");
			alert.setContentText("El numero a adivinar es menor que "+ model.valorProperty().getValue());

			alert.showAndWait();
			
			model.setIntentos(model.getIntentos()+1);
		}else if (model.valorProperty().getValue()==resultado) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("AdivinAPP");
			alert.setHeaderText("Acertaste");
			alert.setContentText("Solo has necesitado " + model.getIntentos()+ " intentos");

			alert.showAndWait();
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Error");
			alert.setContentText("Algo extraño ha ocurrido");
			alert.showAndWait();
		}
	}
	
	}
