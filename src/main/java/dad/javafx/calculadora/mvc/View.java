package dad.javafx.calculadora.mvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class View extends GridPane {
	
	private TextField numerosField;

	private Button ceroButton, unoButton, dosButton, tresButton, cuatroButton, cincoButton, seisButton, sieteButton,
			ochoButton, nueveButton, borrarButton, borrarTodoButton, sumaButton, restaButton, multiplicarButton,
			dividirButton, igualButton, puntoButton;
	
	public View() {
		super();
		
		numerosField = new TextField();
		numerosField.setPromptText("0.0");
		numerosField.setAlignment(Pos.CENTER_RIGHT);
		numerosField.setEditable(false);

		ceroButton = new Button("0");
		ceroButton.setMaxWidth(Double.MAX_VALUE);
		ceroButton.setMaxHeight(Double.MAX_VALUE);
		
		unoButton = new Button("1");
		unoButton.setMaxWidth(Double.MAX_VALUE);
		unoButton.setMaxHeight(Double.MAX_VALUE);
		
		dosButton = new Button("2");
		dosButton.setMaxWidth(Double.MAX_VALUE);
		dosButton.setMaxHeight(Double.MAX_VALUE);
		
		tresButton = new Button("3");
		tresButton.setMaxWidth(Double.MAX_VALUE);
		tresButton.setMaxHeight(Double.MAX_VALUE);
		
		cuatroButton = new Button("4");
		cuatroButton.setMaxWidth(Double.MAX_VALUE);
		cuatroButton.setMaxHeight(Double.MAX_VALUE);
		
		cincoButton = new Button("5");
		cincoButton.setMaxWidth(Double.MAX_VALUE);
		cincoButton.setMaxHeight(Double.MAX_VALUE);
		
		seisButton = new Button("6");
		seisButton.setMaxWidth(Double.MAX_VALUE);
		seisButton.setMaxHeight(Double.MAX_VALUE);
		
		sieteButton = new Button("7");
		sieteButton.setMaxWidth(Double.MAX_VALUE);
		sieteButton.setMaxHeight(Double.MAX_VALUE);
		
		ochoButton = new Button("8");
		ochoButton.setMaxWidth(Double.MAX_VALUE);
		ochoButton.setMaxHeight(Double.MAX_VALUE);
		
		nueveButton = new Button("9");
		nueveButton.setMaxWidth(Double.MAX_VALUE);
		nueveButton.setMaxHeight(Double.MAX_VALUE);
		
		borrarButton = new Button("C");
		borrarButton.setMaxWidth(Double.MAX_VALUE);
		borrarButton.setMaxHeight(Double.MAX_VALUE);
		
		borrarTodoButton = new Button("CE");
		borrarTodoButton.setMaxWidth(Double.MAX_VALUE);
		borrarTodoButton.setMaxHeight(Double.MAX_VALUE);
		
		sumaButton = new Button("+");
		sumaButton.setMaxWidth(Double.MAX_VALUE);
		sumaButton.setMaxHeight(Double.MAX_VALUE);
		
		restaButton = new Button("-");
		restaButton.setMaxWidth(Double.MAX_VALUE);
		restaButton.setMaxHeight(Double.MAX_VALUE);
		
		multiplicarButton = new Button("*");
		multiplicarButton.setMaxWidth(Double.MAX_VALUE);
		multiplicarButton.setMaxHeight(Double.MAX_VALUE);
		
		dividirButton = new Button("/");
		dividirButton.setMaxWidth(Double.MAX_VALUE);
		dividirButton.setMaxHeight(Double.MAX_VALUE);
		
		igualButton = new Button("=");
		igualButton.setMaxWidth(Double.MAX_VALUE);
		igualButton.setMaxHeight(Double.MAX_VALUE);
		
		puntoButton = new Button(".");
		puntoButton.setMaxWidth(Double.MAX_VALUE);
		puntoButton.setMaxHeight(Double.MAX_VALUE);
		
		addRow(0, numerosField);
		addRow(1, sieteButton, ochoButton, nueveButton, borrarTodoButton, borrarButton);
		addRow(2, cuatroButton, cincoButton, seisButton, multiplicarButton, dividirButton);
		addRow(3, unoButton, dosButton, tresButton, restaButton, igualButton);
		addRow(4, ceroButton);
		add(puntoButton, 2, 4);
		add(sumaButton, 3, 4);
		
		GridPane.setColumnSpan(numerosField, 5);
		GridPane.setColumnSpan(ceroButton, 2);
		GridPane.setRowSpan(igualButton, 2);
		
		ColumnConstraints[] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		cols[0].setFillWidth(true);
		cols[1].setFillWidth(true);
		cols[2].setFillWidth(true);
		cols[3].setFillWidth(true);
		cols[4].setFillWidth(true);
		
		cols[0].setHgrow(Priority.ALWAYS);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[2].setHgrow(Priority.ALWAYS);
		cols[3].setHgrow(Priority.ALWAYS);
		cols[4].setHgrow(Priority.ALWAYS);
		
		RowConstraints[] rows = {
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints()
		};
		
		rows[0].setFillHeight(true);
		rows[1].setFillHeight(true);
		rows[2].setFillHeight(true);
		rows[3].setFillHeight(true);
		rows[4].setFillHeight(true);
		
		rows[0].setVgrow(Priority.ALWAYS);
		rows[1].setVgrow(Priority.ALWAYS);
		rows[2].setVgrow(Priority.ALWAYS);
		rows[3].setVgrow(Priority.ALWAYS);
		rows[4].setVgrow(Priority.ALWAYS);
		
		getColumnConstraints().setAll(cols);
		getRowConstraints().setAll(rows);
		
		setPadding(new Insets(25));
		
		setHgap(10);
		setVgap(10);
		
		setGridLinesVisible(true);
		/*GridPane.setFillWidth(numerosField, true);
		GridPane.setFillWidth(ceroButton, true);
		GridPane.setFillHeight(igualButton, true);
		*/
		
	}
	
	public TextField getNumerosField() {
		return numerosField;
	}

	public Button getCeroButton() {
		return ceroButton;
	}

	public Button getUnoButton() {
		return unoButton;
	}

	public Button getDosButton() {
		return dosButton;
	}

	public Button getTresButton() {
		return tresButton;
	}

	public Button getCuatroButton() {
		return cuatroButton;
	}

	public Button getCincoButton() {
		return cincoButton;
	}

	public Button getSeisButton() {
		return seisButton;
	}

	public Button getSieteButton() {
		return sieteButton;
	}

	public Button getOchoButton() {
		return ochoButton;
	}

	public Button getNueveButton() {
		return nueveButton;
	}

	public Button getBorrarButton() {
		return borrarButton;
	}

	public Button getBorrarTodoButton() {
		return borrarTodoButton;
	}

	public Button getSumaButton() {
		return sumaButton;
	}

	public Button getRestaButton() {
		return restaButton;
	}

	public Button getMultiplicarButton() {
		return multiplicarButton;
	}

	public Button getDividirButton() {
		return dividirButton;
	}

	public Button getIgualButton() {
		return igualButton;
	}

	public Button getPuntoButton() {
		return puntoButton;
	}
	
}
