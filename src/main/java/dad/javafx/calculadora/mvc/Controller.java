package dad.javafx.calculadora.mvc;

public class Controller {

	//view
	private View root = new View();
	//model
	private Calculadora calc = new Calculadora();
	
	public Controller() {
		
		root.getCeroButton().setOnAction(e -> onCeroAction());
		root.getUnoButton().setOnAction(e -> onUnoAction());
		root.getDosButton().setOnAction(e -> onDosAction());
		root.getTresButton().setOnAction(e -> onTresAction());
		root.getCuatroButton().setOnAction(e -> onCuatroAction());
		root.getCincoButton().setOnAction(e -> onCincoAction());
		root.getSeisButton().setOnAction(e -> onSeisAction());
		root.getSieteButton().setOnAction(e -> onSieteAction());
		root.getOchoButton().setOnAction(e -> onOchoAction());
		root.getNueveButton().setOnAction(e -> onNueveAction());
		root.getBorrarButton().setOnAction(e -> onBorrarAction());
		root.getBorrarTodoButton().setOnAction(e -> onBorrarTodoAction());
		root.getSumaButton().setOnAction(e -> onSumaAction());
		root.getRestaButton().setOnAction(e -> onRestaAction());
		root.getMultiplicarButton().setOnAction(e -> onMultiplicarAction());
		root.getDividirButton().setOnAction(e -> onDividirAction());
		root.getIgualButton().setOnAction(e -> onIgualAction());
		root.getPuntoButton().setOnAction(e -> onPuntoAction());
	
		root.getNumerosField().textProperty().bind(calc.pantallaProperty());
	
	}

	private void onPuntoAction() {
		calc.insertarComa();
	}

	private void onIgualAction() {
		calc.operar(Calculadora.IGUAL);
	}

	private void onDividirAction() {
		calc.operar(Calculadora.DIVIDIR);
	}

	private void onMultiplicarAction() {
		calc.operar(Calculadora.MULTIPLICAR);
	}

	private void onRestaAction() {
		calc.operar(Calculadora.RESTAR);
	}

	private void onSumaAction() {
		calc.operar(Calculadora.SUMAR);
	}

	private void onBorrarTodoAction() {
		calc.borrarTodo();
	}

	private void onBorrarAction() {
		calc.borrar();
	}

	private void onNueveAction() {
		calc.insertar('9');
	}

	private void onOchoAction() {
		calc.insertar('8');
	}

	private void onSieteAction() {
		calc.insertar('7');
	}

	private void onSeisAction() {
		calc.insertar('6');
	}

	private void onCincoAction() {
		calc.insertar('5');
	}

	private void onCuatroAction() {
		calc.insertar('4');
	}

	private void onTresAction() {
		calc.insertar('3');
	}

	private void onDosAction() {
		calc.insertar('2');
	}

	private void onUnoAction() {
		calc.insertar('1');
	}

	private void onCeroAction() {
		calc.insertar('0');
	}

	public View getRoot() {
		return root;
	}
	
}
