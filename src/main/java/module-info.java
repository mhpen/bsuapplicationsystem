module com.example.bsuapplicationsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqltejdbc;


    opens com.example.bsuapplicationsystem to javafx.fxml;
    exports com.example.bsuapplicationsystem;
}