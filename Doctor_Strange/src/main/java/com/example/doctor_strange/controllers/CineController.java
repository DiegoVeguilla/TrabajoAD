package com.example.doctor_strange.controllers;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
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
import java.io.File;
import java.net.MalformedURLException;

public class CineController   {


    public void empezarCine(Stage stage) {
        File mediaFile = new File("src/main/resources/css/images/Cine.mp4");
        Media media = null;
        try {
            media = new Media(mediaFile.toURI().toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        MediaPlayer mediaPlayer = new MediaPlayer(media);

        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitHeight(1080);
        mediaView.setFitWidth(1920);

        Scene scene = new Scene(new Pane(mediaView), 1440, 2560);

        stage.setScene(scene);
        stage.setHeight(1080);
        stage.setWidth(1920);
        stage.setMaxHeight(1440);
        stage.setMaxWidth(2560);
        stage.setFullScreen(true);
        stage.show();
        mediaPlayer.play();
        mediaPlayer.setOnReady(mediaPlayer.getOnEndOfMedia());

    }


}
