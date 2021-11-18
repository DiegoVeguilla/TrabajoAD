package com.example.doctor_strange;

import com.example.doctor_strange.controllers.CineController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;


public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        int width = gd.getDisplayMode().getWidth() - 60;
        int height = gd.getDisplayMode().getHeight() - 60;

        CineController cineController = new CineController();
        cineController.empezarCine(stage);

        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inicio-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        stage.setTitle("Facultativo raro");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}