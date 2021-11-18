package com.example.doctor_strange.controllers;

import com.example.doctor_strange.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InicioController  {
    @FXML
    private Button btnIniciarSesion, btnRegistrarse;


    @FXML
    void iniciarSesion(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource("iniciar-view.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void registrarse(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource("login-view.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
