package com.aashish.hrmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import java.sql.*;
import java.util.Objects;

public class HelloController {
    public Label username;




    public Label password;
    public Label login;
    public Button Admin;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        class DatabaseConnection {
            private static final String URL = "jdbc:mysql://localhost:3306/ login";
            private static final String USER = "kai";
            private static final String PASSWORD = "9812";

            public static Connection getConnection() throws SQLException {
                return DriverManager.getConnection(URL, USER, PASSWORD);
            }
        }

        try {

            Parent secondScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));

            Stage secondStage = new Stage();
            secondStage.setTitle("dashboardScene");
            secondStage.setScene(new Scene(secondScene));





            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

