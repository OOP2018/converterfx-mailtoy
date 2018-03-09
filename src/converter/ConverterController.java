package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * @author Kanchanok Kannee
 *
 */
public class ConverterController {
	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	
	/**
	 * Convert a distance from one unit to another.
	 */
	 public void handleConvert(ActionEvent event) {
	 // read values from textField(s)
	 String text = textField1.getText().trim();
	 // This is for testing
	 System.out.println("handleConvert converting "+text);
	 // perform the conversion and output the result
	 }
	
}
