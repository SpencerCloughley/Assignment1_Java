package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentCardViewController implements Initializable {

    @FXML
    private ListView<?> activityList;

    @FXML
    private Label nameLabel;

    @FXML
    private Label numberLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
