package com.example.firstjavafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Label redText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!"); }
        protected void onRedButtonClick() {
         redText.setText("Red!");
        }
}