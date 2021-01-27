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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SalariedEmployeeController implements Initializable {

    @FXML
    private TextField salariedName;
    @FXML
    private TextField salariedID;
    @FXML
    private TextField salariedDes;
    @FXML
    private TextField salariedSal;
    @FXML
    private AnchorPane pane;

     //AlertBox Showing start
    public void showErrorAlert()
    {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Sorry");
      alert.setHeaderText("You Have To fill Up All Information Properly");
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
     
          public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }
    
    
    
    //AlertBox Showimg End
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salariedEmpPrev(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("typesEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(SalariedEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

    @FXML
    private void salariedSubmitAction(ActionEvent event) {
        if(salariedName.getText().equals("") || salariedID.getText().equals("") || salariedDes.getText().equals("") || salariedSal.getText().equals(""))
    {
        
        showErrorAlert();
    }
    else
   {
    try {
       String name=salariedName.getText();
       String id= salariedID.getText();
       String des= salariedDes.getText();
       String salary=salariedSal.getText();
       double salaryToDouble=Double.parseDouble(salary);
       showSuccesAlert();
       JoinClass c= new  JoinClass();
       c.salaried(name, id, des, salaryToDouble);
       
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
            Logger.getLogger(SalariedEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void salariedEmpName(ActionEvent event) {
    }

    @FXML
    private void salariedEmpID(ActionEvent event) {
    }

    @FXML
    private void salariedEmpDes(ActionEvent event) {
    }

    @FXML
    private void salariedEmpMonthly(ActionEvent event) {
    }

    
}
