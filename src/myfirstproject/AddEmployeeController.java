
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


public class AddEmployeeController implements Initializable {

    @FXML
    private AnchorPane pane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addEmployee(ActionEvent event) {
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("typesEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void updateSalary(ActionEvent event) {
       try {
            Parent root = FXMLLoader.load(getClass().getResource("UpdateSalaryFxml.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void employeeInformation(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("AllEmpInformation.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void searchEmployee(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("SearchEmployee.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void employeeSalary(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("EmployeeSalary.fxml"));
            pane.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
