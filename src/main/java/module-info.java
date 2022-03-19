module com.example.diagrams {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diagrams to javafx.fxml;
    exports com.example.diagrams;
}