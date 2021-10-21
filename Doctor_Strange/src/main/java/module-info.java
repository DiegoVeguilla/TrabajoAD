module com.example.doctor_strange {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.doctor_strange to javafx.fxml;
    exports com.example.doctor_strange;
}