package com.example.raa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username:");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password:");

        Button signInButton = new Button("Sign in");
        Label errorLabel = new Label();


        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(new Label("Halaman Login"), 0, 0, 2, 1);
        gridPane.add(usernameField, 0, 1, 2, 1);
        gridPane.add(passwordField, 0, 2, 2, 1);
        gridPane.add(signInButton, 0, 3);
        gridPane.add(errorLabel, 0, 4, 2, 1);

        signInButton.setOnAction(event -> {
            String inputUsername = usernameField.getText();
            String inputPassword = passwordField.getText();

            // Validasi username dan password
            if (inputUsername.equals("aurora") && inputPassword.equals("2605")) {
                System.out.println("Login berhasil!");
                newPage(stage, inputUsername);  // Pindah ke halaman baru jika login berhasil
            } else {
                errorLabel.setText("Password Atau Username Salah"); // Password atau username salah
            }
        });

        Scene scene = new Scene(gridPane, 320, 240);
        stage.setTitle("Form Login");
        stage.setScene(scene);
        stage.show();

        errorLabel.setStyle("-fx-text-fill: blue;");
        signInButton.setStyle("-fx-text-fill: blue");
        usernameField.setStyle("-fx-text-inner-color: green;");
        passwordField.setStyle("-fx-text-inner-color: red");
        Label loginLabel = new Label("Halaman Login");

    }

    // Tampilan halaman baru (Form 2)
    private void newPage(Stage previousStage, String username) {
        previousStage.hide(); // Menyembunyikan stage 1

        Stage newStage = new Stage();
        GridPane newRoot = new GridPane();
        newRoot.setAlignment(Pos.CENTER);
        newRoot.setVgap(20);
        newRoot.setHgap(10);

        Label newLabel = new Label("Halo " + username);
        Button backButton = new Button("Kembali");

        backButton.setOnAction(event -> {
            newStage.close();
            previousStage.show();
        });

        newRoot.add(newLabel, 0, 0);
        newRoot.add(backButton, 0, 1);

        Scene newScene = new Scene(newRoot, 320, 240);
        newStage.setTitle("Form 2");
        newStage.setScene(newScene);
        newStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}