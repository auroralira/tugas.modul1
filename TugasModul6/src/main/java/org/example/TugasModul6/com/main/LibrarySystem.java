package org.example.TugasModul6.com.main;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.TugasModul6.books.*;
import org.example.TugasModul6.data.Admin;
import org.example.TugasModul6.data.Student;

import java.util.ArrayList;

public class LibrarySystem {
    public static ArrayList<Book> daftarBuku = new ArrayList<>();
    public static ArrayList<Student> studentList = new ArrayList<>();

    public static void startLibrarySystem(Stage stage) {
        daftarBuku.add(new StoryBook("Id666", "Hujan", 17, "Story", "Aurora"));
        daftarBuku.add(new HistoryBook("JP696", "omen", 2, "History", "Verina"));
        daftarBuku.add(new TextBook("DT00", "Bangku Kosong", 4, "Text", "Liraa"));

        studentList.add(new Student("202310370311200", "Aurora", "Teknik", "Informatika"));
        studentList.add(new Student("202310370311184", "Jasmine", "Teknik", "Industri"));
        studentList.add(new Student("202310370311195", "Nida", "Teknik", "Mesin"));

        VBox root = new VBox(10);
        Scene scene = new Scene(root, 400, 300);

        Label label = new Label("===== Library System =====");

        root.setAlignment(Pos.CENTER);
        Button studentLoginButton = new Button("Login sebagai Mahasiswa");
        studentLoginButton.setPrefHeight(80);
        studentLoginButton.setPrefWidth(200);

        Button adminLoginButton = new Button("Login sebagai Admin");
        adminLoginButton.setPrefHeight(80);
        adminLoginButton.setPrefWidth(200);

        Button exitButton = new Button("Keluar");
        exitButton.setPrefWidth(80);
        exitButton.setPrefHeight(200);

        studentLoginButton.setOnAction(event -> studentLogin(stage));
        adminLoginButton.setOnAction(event -> {
            try {
                new Admin().login(stage);
            } catch (Exception e) {
                showErrorDialog("Error", e.getMessage());
            }
        });
        exitButton.setOnAction(event -> stage.close());

        root.getChildren().addAll(label, studentLoginButton, adminLoginButton, exitButton);

        stage.setScene(scene);
        stage.setTitle("Library System");
        stage.show();
    }

    private static void studentLogin(Stage stage) {
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 400, 300);

        Label label = new Label("Masukkan NIM : ");
        TextField nimField = new TextField();
        Button loginButton = new Button("Login");
        Button backButton = new Button("Kembali");

        loginButton.setOnAction(event -> {
            String nimStudent = nimField.getText();
            if (nimStudent.length() == 15 && checkNim(nimStudent)) {
                Student student = new Student(nimStudent);
                student.login(stage);
            } else {
                showErrorDialog("Error", "Nim tidak terdaftar atau tidak valid!");
            }
        });

        backButton.setOnAction(event -> startLibrarySystem(stage));

        root.getChildren().addAll(label, nimField, loginButton, backButton);

        stage.setScene(scene);
    }

    private static void showErrorDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static boolean checkNim(String nim) {
        for (Student student : studentList) {
            if (student.getNim().equals(nim)) {
                return true;
            }
        }
        return false;
    }
}
