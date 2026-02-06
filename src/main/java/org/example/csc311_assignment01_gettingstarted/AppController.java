package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField number1Field;
    
    @FXML
    private TextField number2Field;

    // ToDo 02: when the button is clicked show the output on the screen

    // ToDo 03: you should accept only the numeric values

    // ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red

    // ToDo 05: commit changes and push back to the same repo


    @FXML
    protected void onCalculateButtonClick() {
        try {
            // Get text from both fields
            String num1Text = number1Field.getText().trim();
            String num2Text = number2Field.getText().trim();
            
            // Validate input is not empty
            if (num1Text.isEmpty() || num2Text.isEmpty()) {
                welcomeText.setText("Please enter both numbers!");
                return;
            }
            
            // Parse to double (accepts only numeric values)
            double num1 = Double.parseDouble(num1Text);
            double num2 = Double.parseDouble(num2Text);
            
            // Calculate sum
            double sum = num1 + num2;
            
            // Display result
            welcomeText.setText("Sum: " + sum);
            
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            welcomeText.setText("Error: Please enter valid numeric values only!");
        }
    }
}