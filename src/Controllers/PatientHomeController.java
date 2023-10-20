package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PatientHomeController implements Initializable {

    @FXML
    private Button logout;
    
    @FXML
    private TextArea Notifications;
    
    @FXML
    void inventoryClicked(ActionEvent event) {
           try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/PatientInventory.fxml"));
            Stage window = (Stage) logout.getScene().getWindow();
            window.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void prescriptionClicked(ActionEvent event) { 
           try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/MakePrescription.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     @FXML
    void replyClicked(ActionEvent event) {
        try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/PatientsMessage.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void logoutClicked() {
        try {
            
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Log in pre.fxml"));
            Stage window = (Stage) logout.getScene().getWindow();
            
            window.setScene(new Scene(root, 1920, 1080));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    
}
