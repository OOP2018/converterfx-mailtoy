package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * 
 * @author Kanchanok Kannee
 *
 */
public class ConverterController {
	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	@FXML
	private ComboBox<Length> comboBox1;
	@FXML
	private ComboBox<Length> comboBox2;

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		double input = 0;
		try {
			Length unit1 = comboBox1.getValue();
			Length unit2 = comboBox2.getValue();
			double convertNumber = 0;
			double convertNumber2 = 0;
			if (!textField1.getText().isEmpty()) {
				input = Double.parseDouble(textField1.getText().trim());
				convertNumber = (unit1.getValue() / unit2.getValue()) * input;
				textField2.setText(String.format("%.4g", convertNumber));
			} else {
				input = Double.parseDouble(textField2.getText().trim());
				convertNumber2 = (unit2.getValue() / unit1.getValue()) * input;
				textField1.setText(String.format("%.4g", convertNumber2));
			}
		} catch (Exception e) {
			textField1.setText("Invalid number!");
			textField2.setText("Invalid number!");
		}

	}

	/**
	 * Clear input field (for next use).
	 */
	public void handleClear() {
		textField1.clear();
		textField2.clear();
	}

	/**
	 * JavaFX calls the initialize() method of your controller when it creates
	 * the UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		System.out.println("Running initialize");
		if (comboBox1 != null) {
			comboBox1.getItems().addAll(Length.values());
			comboBox1.getSelectionModel().select(0); // select an item to show
		}
		if (comboBox2 != null) {
			comboBox2.getItems().addAll(Length.values());
			comboBox2.getSelectionModel().select(1); // select an item to show
		}
	}

}
