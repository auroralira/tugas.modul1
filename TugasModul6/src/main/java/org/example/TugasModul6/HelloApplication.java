package org.example.TugasModul6;

import com.sun.net.httpserver.Authenticator;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.TugasModul6.com.main.LibrarySystem;

import java.sql.SQLOutput;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Start Library System");
        button.setOnAction(event -> LibrarySystem.startLibrarySystem(stage));
        Button button1 = new Button("Tombol");
        Button 1

        VBox root = new VBox(10, button, button1);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Library system");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
