
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


public class SearchEmployeeController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private TextField inputId;
    @FXML
    private TextField resultSearch;
    @FXML
    private Button searchId;
 
         public void showWarningAlert()
    {
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setTitle("Employee Not Found");
      alert.setHeaderText("Sorry!! ID Not Matching!!");
      alert.setContentText("Enter Correct Id Number");
      alert.show();
    }
      
    public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
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
    private void SearchEmpID(ActionEvent event) {
    }

    @FXML
    private void searchEmpDetails(ActionEvent event) {
    }

    @FXML
    private void searchEmpAction(ActionEvent event) {
        
         try {
             String id = inputId.getText();
        JoinClass c = new JoinClass();
        c.searchId = id;
        String searchOut=c.searchID();
        resultSearch.setText(searchOut);
        } 
        
        catch (Exception e) {
            showWarningAlert();
            
        }
    }
    
}
