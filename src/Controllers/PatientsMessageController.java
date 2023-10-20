/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class PatientsMessageController implements Initializable {
    
    @FXML
    TextField message;
    TextField patientUsername;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void button(){
        System.out.println("Yea");
//        System.out.println(message.getText());
//        System.out.println(patientUsername.getText());
        Stage window = (Stage) message.getScene().getWindow();
        window.close();
        
    }
    
    
}
