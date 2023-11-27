package com.example.bsuapplicationsystem.Controllers;

import com.example.bsuapplicationsystem.Models.Model;
import com.example.bsuapplicationsystem.Controllers.User.UserController;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public TextField usernameTfield;
    public PasswordField passwordTfield;
    public Button loginBTN;
    public Button switchAdminBTN;
    public Button registerBTN;
    public Text invalidMessage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginBTN.setOnAction(actionEvent -> handleLogin());
    }

    private void handleLogin() {
        Stage stage = (Stage) invalidMessage.getScene().getWindow();
        UserController userController = new UserController();
        Model.getInstance().getViewsFactory().closeStage(stage);
        Model.getInstance().getViewsFactory().showClientWindow(userController);
    }


}