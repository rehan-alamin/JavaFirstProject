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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class HourlyEmployeeController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private Button h_submit;
    @FXML
    private TextField h_name;
    @FXML
    private TextField h_id;
    @FXML
    private TextField h_designation;
    @FXML
    private TextField h_rate;
    @FXML
    private TextField h_worked;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

        public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }
    
    
    public void showSuccesAlert()
    {
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setTitle("Information Added");
      alert.setHeaderText("Congratulation!!Infromation SuccesFully Submitted ");
      alert.showAndWait();
    }
     public void showWarningAlert()
    {
      Alert alert = new Alert(AlertType.WARNING);
      alert.setTitle("Wrong Information");
      alert.setHeaderText("Salary Must Be Number Format");
      alert.setContentText(" Salary = 100");
      alert.show();
    }
    
    @FXML
    private void hourlyEmpPev(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("typesEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(HourlyEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void hourlySubmitAction(ActionEvent event) {
    if(h_name.getText().equals("") || h_id.getText().equals("") || h_designation.getText().equals("") ||h_worked.getText().equals("")||h_rate.getText().equals(""))
    {
        
        showWarningAlert();
    }
    else
    {
        try {
       String name=h_name.getText();
       String id= h_id.getText();
       String des= h_designation.getText();
       String hourwork=h_worked.getText();
       String hourRate=h_rate.getText();
       int hw=Integer.parseInt(hourwork);
     double hr =Double.parseDouble(hourRate);
       
       showSuccesAlert();
       JoinClass c= new  JoinClass();
     c.hourly(name, id, des, hr, hw);
       
       }
       catch (NumberFormatException e) {
             showWarningAlert();
       }   
    }
    
    
    
    }

    @FXML
    private void homePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(HourlyEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void hourlyName(ActionEvent event) {
    }

    @FXML
    private void hourlyId(ActionEvent event) {
    }

    @FXML
    private void hourlyDes(ActionEvent event) {
    }

    @FXML
    private void hourlyRate(ActionEvent event) {
    }

    @FXML
    private void hourlyWorked(ActionEvent event) {
    }
    
}
