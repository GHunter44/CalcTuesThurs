package bsu.comp152.calctuesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class Calcwindow {
    private int storedNumber;
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
    }

    @FXML
    public void subtractButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
    }

    public void multiplyButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
    }

    public void divideButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
    }

    @FXML
    public void equalButtonPressed(){
       var currentNumber = Integer.parseInt(numberDisplay.getText()); //Combining it all into one like Instead of splitting it like done above.
       var addSum = currentNumber + storedNumber;
       //var subtractSum = storedNumber - currentNumber;
       //var multiplySum = currentNumber * storedNumber;
       //var divideSum = storedNumber/currentNumber;
       numberDisplay.setText(""+ addSum); //Uses a blank string to turn the Sum Int into a String
    }


    @FXML
    public void clearCalculator(ActionEvent event){
        numberDisplay.clear(); //could just use numberDisplay.setText(""); but .clear is a javafx control

    }




}
