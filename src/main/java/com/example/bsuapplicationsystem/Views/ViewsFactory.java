package com.example.bsuapplicationsystem.Views;

import com.example.bsuapplicationsystem.Controllers.User.UserController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewsFactory {
    // Client Views
    private final StringProperty userSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane programOffersView;

    public ViewsFactory() {
        this.userSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getUserSelectedMenuItem(){
        return userSelectedMenuItem;
    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                System.out.println("Loading Dashboard FXML");
                dashboardView = new FXMLLoader(getClass().getResource("/fxml/User/homeDashboard.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return dashboardView;
    }

    public AnchorPane getProgramOffersView() {
        if (programOffersView == null) {
            try {
                System.out.println("Loading Program Offers FXML");
                programOffersView = new FXMLLoader(getClass().getResource("/fxml/User/programOffers.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return programOffersView;
    }

    public void showLoginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
            Scene scene = new Scene(loader.load());
            createStage(scene, "BSU-LIPA TAO SYSTEM");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showClientWindow(UserController userController) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/User/user.fxml"));
            loader.setController(userController);
            Scene scene = new Scene(loader.load());
            createStage(scene, "BSU-LIPA TAO SYSTEM");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createStage(Scene scene, String title) {
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}