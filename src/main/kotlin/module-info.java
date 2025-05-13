module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.example to javafx.fxml;
    exports com.example;
    opens presentacion to javafx.fxml;
    exports presentacion;
}