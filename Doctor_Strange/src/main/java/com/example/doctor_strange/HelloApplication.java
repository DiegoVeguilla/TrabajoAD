package com.example.doctor_strange;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.mongodb.client.*;
import org.bson.Document;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menuview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        MongoClient client = MongoClients.create("mongodb+srv://Java:java@cluster0.pyfbj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase database = client.getDatabase("registro");
        MongoCollection collection = database.getCollection("registro");

        Document sampleDoc = new Document("id", "1").append("name", "Diego Veguilla");

        collection.insertOne(sampleDoc);

    }

    public static void main(String[] args) {
        launch();
    }
}