
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


public class EmployeeSalaryController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private TextField s_id;
    @FXML
    private Button s_show;
    @FXML
    private TextField s_details;

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
      alert.setTitle("Employee Not Found");
      alert.setHeaderText("Sorry!! No Employee Found At This ID!!");
      alert.setContentText("Enter Correct Id Number");
      alert.show();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    



    @FXML
    private void showSalaryAction(ActionEvent event) {
       
    }

    @FXML
    private void searchEmpPrev(ActionEvent event) {
        
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
    private void EmpSalaryID(ActionEvent event) {
    }

    @FXML
    private void empSalarySearch(ActionEvent event) {
        
        try {
        JoinClass c= new JoinClass();
        c.searchId=s_id.getText();
        String res=c.Salary();
        s_details.setText(res);
        } 
        catch (Exception e) 
        {
           showWarningAlert();
        }
    }
    
}
