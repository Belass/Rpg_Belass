module com.example.rpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpg to javafx.fxml;
    exports com.example.rpg;
}