/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class MakePrescriptionController implements Initializable {

    
    @FXML
    public Label patientName;
    public Label med01;
    public Label med02;
    public Label med03;
    public Label DoctorAdvice;
    public TextField userNameIP;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       // System.out.println("Loadinggg!");
    }    
    
     public void userNameInsert(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/MakePrescription.fxml"));
            Stage window = (Stage) userNameIP.getScene().getWindow();
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     
     public void med1insert(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/MakePrescription.fxml"));
            Stage window = (Stage) med01.getScene().getWindow();
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     
    
}
