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

public class WelcomeController implements Initializable {
    
    @FXML
    public Button healthcare, bloodbank;
    Button openInvertory;
    
    
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void gotoLoginPage(){
        try {
            Parent root = (Parent) FXMLLoader.load(getClass().getResource("/UI/Log in pre.fxml"));
            Stage window = (Stage) healthcare.getScene().getWindow();
            window.setTitle("Log in");
            window.setScene(new Scene(root));
            window.setX(0);
            window.setY(0);
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void healthcareClicked() {
        System.out.println("Clicked Healthcare");
        System.out.println(healthcare.getText());
//      System.out.println(o.doctor.ODoctor.key);
//      o.doctor.ODoctor.key = 2;
        gotoLoginPage();
    }
    
    @FXML
    public void prescriptionClicked() {
        System.out.println("Tillo");
        try {
            Parent root = (Parent) FXMLLoader.load(getClass().getResource("/UI/MakePrescription.fxml"));
            Stage window = (Stage) healthcare.getScene().getWindow();
            window.setScene(new Scene(root));
            window.setTitle("Blood Bank");
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @FXML
    void bloodBankClicked(ActionEvent event) {
          try {
            Parent root = (Parent) FXMLLoader.load(getClass().getResource("/UI/BloodBank.fxml"));
            Stage window = (Stage) healthcare.getScene().getWindow();
            window.setScene(new Scene(root));
            window.setTitle("Blood Bank");
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @FXML
    void inventoryClicked(ActionEvent event) {
           try {
            Parent root = (Parent) FXMLLoader.load(getClass().getResource("/UI/FreePharmacy.fxml"));
            Stage window = (Stage) healthcare.getScene().getWindow();
            window.setScene(new Scene(root));
            window.setTitle("Inventory");
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

