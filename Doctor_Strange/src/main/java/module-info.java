module com.example.doctor_strange {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.doctor_strange to javafx.fxml;
    exports com.example.doctor_strange;
    exports com.example.doctor_strange.controllers;
    opens com.example.doctor_strange.controllers to javafx.fxml;
}