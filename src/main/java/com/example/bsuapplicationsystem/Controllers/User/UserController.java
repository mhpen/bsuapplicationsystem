package com.example.bsuapplicationsystem.Controllers.User;

import com.example.bsuapplicationsystem.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {
    public BorderPane user_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewsFactory().getUserSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            // Check if the new value is the same as the old value (no change needed)
            if (oldVal.equals(newVal)) {
                return;
            }

            switch (newVal) {
                case "Program Offers" -> user_parent.setCenter(Model.getInstance().getViewsFactory().getProgramOffersView());
                default -> user_parent.setCenter(Model.getInstance().getViewsFactory().getDashboardView());
            }
        });
    }
}