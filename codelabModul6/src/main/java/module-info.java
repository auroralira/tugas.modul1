module com.example.raa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.raa to javafx.fxml;
    exports com.example.raa;
}