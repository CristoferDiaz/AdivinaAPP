package dad.adivina;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class AdivinModel {
	private IntegerProperty valor = new SimpleIntegerProperty();
	private IntegerProperty intentos = new SimpleIntegerProperty(1);

	public final IntegerProperty valorProperty() {
		return this.valor;
	}

	public final int getValor() {
		return this.valorProperty().get();
	}

	public final void setValor(final int valor) {
		this.valorProperty().set(valor);
	}

	public final IntegerProperty intentosProperty() {
		return this.intentos;
	}

	public final int getIntentos() {
		return this.intentosProperty().get();
	}

	public final void setIntentos(final int intentos) {
		this.intentosProperty().set(intentos);
	}

}
