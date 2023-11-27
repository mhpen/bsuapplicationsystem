package com.example.bsuapplicationsystem;

import com.example.bsuapplicationsystem.Models.Model;
import com.example.bsuapplicationsystem.Views.ViewsFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Model.getInstance().getViewsFactory().showLoginWindow();
    }


}
