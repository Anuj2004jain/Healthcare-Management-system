package com.wellbiing.wellbiinghealthcare;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WellBiingApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(WellBiingApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);
        stage.setTitle("WellBiing Healthcare Management System");
        stage.setScene(scene);
//        stage.setMaxHeight(1080);
//        stage.setMaxWidth(1920);
        stage.setMinHeight(1500);
        stage.setMinWidth(768);
        stage.setMaximized(true);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
    public static void main(String[] args) {
        launch();
    }
}