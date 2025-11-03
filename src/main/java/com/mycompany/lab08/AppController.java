/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab08;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author 6323612
 */
public class AppController implements Initializable {


    @FXML
    private ToggleGroup colorToggle;
    @FXML
    private ToggleGroup sizeToggle;
    //@FXML
    //private Pane drawingAreaPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void undoButtonPressed(ActionEvent event) {
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
    }

}
