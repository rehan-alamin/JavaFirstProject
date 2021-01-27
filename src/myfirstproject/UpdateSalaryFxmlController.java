
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


public class UpdateSalaryFxmlController implements Initializable {

    @FXML
    private TextField upSalaryId;
    @FXML
    private TextField upSalarySal;
    @FXML
    private AnchorPane pane;
    @FXML
    private Button update;

    
    public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }
    
    
    public void showWarningAlert()
    {
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setTitle("Updated Failed");
      alert.setHeaderText("Update Failed");
      alert.setContentText("Please Give The Correct Id Number and Amount fill Up");
      alert.show();
    }
       
     public void showSuccesAlert()
    {
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Updated");
      alert.setHeaderText("Updated Succesfully");
      alert.setContentText("Infromation Submitted!!");
      alert.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void upSalaryPrev(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void homePage(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void increaseEmpUpdate(ActionEvent event) {
          try {
        String id= upSalaryId.getText();
        String am= upSalarySal.getText();
        double amt= Double.parseDouble(am);
        JoinClass c= new  JoinClass();
        c.searchId=id;
        c.amt=amt;
        //c.updateSalary();
        String s=c.updateSalary();
        
        if("Yes".equals(s))
        {
            showSuccesAlert();
        }
        else{
            
            showWarningAlert();
        }
        } 
        catch (NumberFormatException e) 
        {
            showWarningAlert();
        }
    }

    @FXML
    private void increaseEmpID(ActionEvent event) {
    }

    @FXML
    private void increaseEmpSalary(ActionEvent event) {
    }
    
}
