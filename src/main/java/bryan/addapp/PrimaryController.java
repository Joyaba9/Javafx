package bryan.addapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField Firstnum;
    @FXML
    private TextField Secondnum;
    @FXML
    private Label sumlabel;
    @FXML
    private Button calcbutton;

   

    @FXML
    private void calcbuttonclick(ActionEvent event) {
        
        int sum;
        sum = Integer.parseInt(Firstnum.getText()) + Integer.parseInt(Secondnum.getText());
        sumlabel.setText("" + sum);
        
    }
}
