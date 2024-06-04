module org.example.TugasModul6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.httpserver;
    requires java.sql;

    opens org.example.TugasModul6 to javafx.fxml;
    exports org.example.TugasModul6;
}
