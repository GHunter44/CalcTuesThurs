package bsu.comp152.calctuesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class Calcwindow {
    private double storedNumber;
    private OperatorType lastOp;
    @FXML
    private TextField numberDisplay;

    @FXML
    public void numberButtonPushed(ActionEvent event){
        var currentText = numberDisplay.getText();
        var ButtonPressed = (Button)event.getSource();
        var currentNumberText = ButtonPressed.getText();
        var newText = currentText+currentNumberText;
        numberDisplay.setText(newText);
    }

    @FXML
    public void addButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
        lastOp = OperatorType.Add;
    }

    @FXML
    public void subtractButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
        lastOp = OperatorType.Subtract;
    }

    public void multiplyButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
        lastOp = OperatorType.Multiply;
    }

    public void divideButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
        lastOp = OperatorType.Divide;
    }

    @FXML
    public void equalButtonPressed(){
        double result = 0.0;
        double currentNumber = Integer.parseInt(numberDisplay.getText()); //Combining it all into one like Instead of splitting it like done above.
        switch (lastOp){
            case Add -> result = storedNumber + currentNumber;
            case Subtract -> result = storedNumber - currentNumber;
            case Multiply -> result = storedNumber * currentNumber;
            case Divide -> result = storedNumber/currentNumber;
        }
       numberDisplay.setText(""+ result); //Uses a blank string to turn the result double into a String
    }


    @FXML
    public void clearCalculator(ActionEvent event){
        numberDisplay.clear(); //could just use numberDisplay.setText(""); but .clear is a javafx control

    }




}
