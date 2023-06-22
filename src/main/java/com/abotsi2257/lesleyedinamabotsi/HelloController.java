package com.abotsi2257.lesleyedinamabotsi;
/**
 * Name : Abotsi Lesley Kwasi Edinam
 * ID: 10862257
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}