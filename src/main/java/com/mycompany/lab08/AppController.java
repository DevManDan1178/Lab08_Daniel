/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab08;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
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
    @FXML
    private Button undoBtn;
    @FXML
    private Button clearBtn;
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton blackRadio;
    @FXML
    private RadioButton redRadio;
    @FXML
    private RadioButton greenRadio;
    @FXML
    private RadioButton blueRadio;
    @FXML
    private RadioButton smallRadio;
    @FXML
    private RadioButton mediumRadio;
    @FXML
    private RadioButton largeRadio;
    
    private PenSize paintSize;
    private Color paintColor;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        blackRadio.setUserData(Color.BLACK);
        redRadio.setUserData(Color.RED);
        greenRadio.setUserData(Color.GREEN);
        blueRadio.setUserData(Color.BLUE);
        smallRadio.setUserData(PenSize.SMALL);
        mediumRadio.setUserData(PenSize.MEDIUM);
        largeRadio.setUserData(PenSize.LARGE);
    }    
   
    
    @FXML
    private void undoButtonPressed(ActionEvent event) {
        ObservableList<Node> children = drawingAreaPane.getChildren();
        if (children.isEmpty()) {
            return;
        }
        children.remove(children.size() - 1);
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
    }

    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
        RadioButton colorRadio = (RadioButton) colorToggle.getSelectedToggle();
        paintColor = (Color) colorRadio.getUserData();
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
        RadioButton sizeRadio = (RadioButton) sizeToggle.getSelectedToggle();
        paintSize = (PenSize) sizeRadio.getUserData();
    }

    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);
        private int radius;
        private PenSize(int radius) {this.radius = radius;}
        public int getRadius() {return radius;}
    }
}
