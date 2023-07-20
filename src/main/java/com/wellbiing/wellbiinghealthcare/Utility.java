package com.wellbiing.wellbiinghealthcare;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Utility {

    public void ErrorAlert(String title, String message){
        Alert alert = new Alert(Alert.AlertType.ERROR, message + "\r\n", ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }

    public boolean ConfirmAlert(String title, String message){
        Alert alert = new Alert(Alert.AlertType.WARNING, message + "\r\n", ButtonType.OK, ButtonType.CANCEL);
        alert.setTitle(title);
        Optional<ButtonType> choice = alert.showAndWait();
        if (choice.isPresent()){
            if (choice.get() == ButtonType.OK){
                return true;
            }
            if (choice.get() == ButtonType.CANCEL){
                return false;
            }
        }
        return false;
    }

    public void SuccessAlert(String title, String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message + "\r\n", ButtonType.OK);
        alert.setTitle(title);
        alert.showAndWait();
    }
    public boolean CheckInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }



}
