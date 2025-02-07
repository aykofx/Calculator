import java.text.DecimalFormat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    
    @FXML private TextField textField;
    @FXML private TextField textField2;
    @FXML private ChoiceBox<String> operators;
    @FXML private Label result;
    
    // Method that adds the operators to the ChoiceBox at the beginning and selects the first one
    // setText to "" so that nothing is displayed
    @FXML void initialize() {
        operators.getItems().addAll("Addition", "Subtraction", "Multiplication", "Division");
        operators.getSelectionModel().selectFirst();
        result.setText("");
    }
    
    // Method to exit the application
    @FXML protected void exit(ActionEvent e) {
        Platform.exit();
    }
    
    // Method for performing calculations
    @FXML protected void calculate(ActionEvent e) {
        String selectedOperation = operators.getSelectionModel().getSelectedItem();
        double calculation, number1, number2;
        
        // TextField is a String, so convert it to a Double
        number1 = Double.parseDouble(textField.getText());
        number2 = Double.parseDouble(textField2.getText());
        
        if(selectedOperation.equals("Addition")) {
            calculation = number1 + number2;
            result.setText(String.valueOf(calculation));
        }
        
        if(selectedOperation.equals("Subtraction")) {
            calculation = number1 - number2;
            result.setText(String.valueOf(calculation));
        }
        
        if(selectedOperation.equals("Multiplication")) {
            calculation = number1 * number2;
            result.setText(String.valueOf(calculation));
        }
        
        if(selectedOperation.equals("Division")) {
            if(number2 != 0) {
                calculation = number1 / number2;
                DecimalFormat decimalFormat = new DecimalFormat("0.###");
                String formattedResult = decimalFormat.format(calculation);
                result.setText(formattedResult);
            } else {
                result.setText("0");
            }
        }
    }
}
