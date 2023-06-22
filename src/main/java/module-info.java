module com.example.lesleyedinamabotsi {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.abotsi2257.lesleyedinamabotsi;
    opens com.abotsi2257.lesleyedinamabotsi to javafx.fxml;
}