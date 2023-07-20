package com.wellbiing.wellbiinghealthcare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.lang.reflect.Field;

public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label invalid;
    @FXML
    private Label valid;
    static  String Username;

    @FXML
    void ButtonHoverEnd(MouseEvent event) {
        Button b = (Button)event.getSource();
        b.setStyle("-fx-background-color: #ffffff");
        b.setStyle(("-fx-background-radius: 50px"));
    }

    @FXML
    void ButtonHoverStart(MouseEvent event) {
        Button b = (Button)event.getSource();
        b.setStyle("-fx-background-color: #a4adb7");
        b.setStyle(("-fx-background-radius: 50px"));
    }

    @FXML
    void onLoginButtonClick(ActionEvent event) throws IOException {
        checkCredentials();
    }
    private void checkCredentials() throws IOException {
        String Password;

        Username = username.getText();
        Password = password.getText();

        if ((username.getText().isEmpty()) && (password.getText().isEmpty())){
            valid.setText("");
            invalid.setText("Enter Credentials");
        }
        else if ((!Username.isEmpty()) && (!Password.isEmpty())) {
            LoginJDBC db = new LoginJDBC();
            WellBiingApplication w = new WellBiingApplication();
            if (db.checkPassword(Username, Password)) {
                invalid.setText("");
                valid.setText("Login Successful!");

                if(Username.equals("Doctor") || Username.equals("doctor")) {
                    w.changeScene("doctor.fxml");
                }
                else {
                    w.changeScene("patient.fxml");
                }
            }
            else {
                valid.setText("");
                invalid.setText("Invalid Credentials!");
            }



        }

    }
    public void enterKeyPressTF(ActionEvent event) throws IOException{
        TextField textField = (TextField)event.getSource();
        textField.setOnKeyPressed(e ->{
            if (e.getCode() == KeyCode.ENTER){
                try {
                    checkCredentials();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public void enterKeyPressPF(ActionEvent event) throws IOException{
        PasswordField PassField = (PasswordField) event.getSource();
        PassField.setOnKeyPressed(e ->{
            if (e.getCode() == KeyCode.ENTER){
                try {
                    checkCredentials();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}
