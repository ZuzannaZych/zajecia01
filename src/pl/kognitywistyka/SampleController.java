package pl.kognitywistyka;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class SampleController {

	@FXML TextArea textArea;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("You've clicked on about");
	}

	
}
