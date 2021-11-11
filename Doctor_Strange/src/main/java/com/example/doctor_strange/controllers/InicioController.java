package com.example.doctor_strange.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InicioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}