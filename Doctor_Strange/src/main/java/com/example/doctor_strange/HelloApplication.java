package com.example.doctor_strange;

import com.example.doctor_strange.controllers.CineController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Preloader;
import javafx.application.Preloader.StateChangeNotification.Type;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Preloader {


    @Override
    public void start(Stage stage) throws Exception {

        CineController cineController = new CineController();
        cineController.empezarCine(stage);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu_view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Hello!");
        stage.setScene(scene1);
        stage.setFullScreen(true);
        stage.show();








    }
}