/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class TypesEmployeeController implements Initializable {

    @FXML
    private AnchorPane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salariedEmployee(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("salariedEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(TypesEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void hourlyEmployee(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HourlyEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(TypesEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void commissionEmployee(ActionEvent event) {
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("commissionEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(TypesEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void typesEmployeePrev(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(TypesEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void homePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(TypesEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
