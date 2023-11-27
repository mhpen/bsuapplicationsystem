package com.example.bsuapplicationsystem.Controllers.User;

import com.example.bsuapplicationsystem.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class UserMenuController implements Initializable {

    public Button homeBTN;
    public Button programOffersBTN;
    public Button applicationBTN;
    public Button statusBTN;
    public Button forumBTN;
    public Button signOutBTN;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Handle button clicks or any other menu-related logic
        addListener();
    }


    private void addListener() {
        homeBTN.setOnAction(actionEvent -> {
            System.out.println("Home button clicked");
            onDashboard();
        });
        programOffersBTN.setOnAction(event -> {
            System.out.println("Program Offers button clicked");
            onProgramOffer();
        });
        signOutBTN.setOnAction(event -> {
            System.out.println("Sign Out button clicked");
            onSignOut();
        });
    }
    private void onProgramOffer() {
        Model.getInstance().getViewsFactory().getUserSelectedMenuItem().set("Program Offers");
    }

    private void onDashboard() {
        Model.getInstance().getViewsFactory().getUserSelectedMenuItem().set("Home");
    }

    private void handleHomeButtonClick() {
        // Logic for handling Home button click
    }

    private void handleApplicationButtonClick() {
        // Logic for handling Application button click
    }

    private void handleStatusButtonClick() {
        // Logic for handling Application Status button click
    }

    private void handleForumButtonClick() {
        // Logic for handling Forum button click
    }

    private void onSignOut() {
        // Logic for handling Logout button click
        Stage stage = (Stage) homeBTN.getScene().getWindow();
        stage.close(); // Close the current stage

        // Show the login window
        Model.getInstance().getViewsFactory().showLoginWindow();
    }
}
