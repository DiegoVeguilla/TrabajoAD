module com.example.doctor_strange {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.json;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;


    opens com.example.doctor_strange to javafx.fxml;
    exports com.example.doctor_strange;
}