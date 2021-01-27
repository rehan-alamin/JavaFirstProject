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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CommissionEmployeeController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private Button c_submit;
    @FXML
    private TextField c_name;
    @FXML
    private TextField c_id;
    @FXML
    private TextField c_designation;
    @FXML
    private TextField c_commission;
    @FXML
    private TextField c_sale;

    
     public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }
    
    
     public void showErrorAlert()
    {
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Sorry");
      alert.setHeaderText("You Have To fill Up All Information Properly");
      alert.showAndWait();
    }
    
    public void showSuccesAlert()
    {
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle("Information Added");
      alert.setHeaderText("Congratulation!!Infromation SuccesFully Submitted ");
      alert.showAndWait();
    }
     public void showWarningAlert()
    {
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setTitle("Wrong Information");
      alert.setHeaderText("Salary Must Be Number Format");
      alert.setContentText(" Salary = 100");
      alert.show();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void commissionSubmitActioon(ActionEvent event) {
        if(c_name.getText().equals("") || c_id.getText().equals("") || c_designation.getText().equals("") || c_commission.getText().equals("")|| c_sale.getText().equals(""))
    {
        
        showErrorAlert();
    }
    else
   {
    try {
       String name=c_name.getText();
       String id= c_id.getText();
       String des= c_designation.getText();
       String comsionRate=c_commission.getText();
       String comisionSale=c_sale.getText();
       double comrateToDouble=Double.parseDouble(comsionRate);
       double comSaleToDouble=Double.parseDouble(comsionRate);
       showSuccesAlert();
       JoinClass c= new  JoinClass();
       c.commission(name, id, des, comSaleToDouble, comSaleToDouble);
       
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
            Logger.getLogger(CommissionEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void commissionName(ActionEvent event) {
    }

    @FXML
    private void commissionId(ActionEvent event) {
    }

    @FXML
    private void commissionDes(ActionEvent event) {
    }


    @FXML
    private void commissionPrev(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("typesEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(CommissionEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void commissinCom(ActionEvent event) {
    }

    @FXML
    private void commissionSale(ActionEvent event) {
    }
    
}
