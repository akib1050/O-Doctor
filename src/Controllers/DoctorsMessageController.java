/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
public class DoctorsMessageController implements Initializable {
    
    @FXML
    TextField message;
    
    @FXML
    TextField patientUsername;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void button() throws ClassNotFoundException, SQLException {
        String Message = message.getText();
        String Username = patientUsername.getText();
        System.out.println(Message);
        SQL sql = new SQL();
        sql.writeDB("UPDATE messages SET Message1=\""+Message+"\" WHERE Username = \""+Username+"\"");
        
        Stage window = (Stage) message.getScene().getWindow();
        window.close();
        
    }
    
    
}
