module com.example.bsuapplicationsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    exports com.example.bsuapplicationsystem.Controllers;
    exports com.example.bsuapplicationsystem.Controllers.User;


    opens com.example.bsuapplicationsystem to javafx.fxml;
    exports com.example.bsuapplicationsystem;
}

