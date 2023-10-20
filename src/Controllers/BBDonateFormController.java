/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UI.bbRow;
import UI.ffRow;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class BBDonateFormController implements Initializable {

    @FXML
    private TextArea name;
        
    @FXML
    private TextArea bGroup;

    @FXML
    private TextArea lastDonation;

    @FXML
    private TextArea contact;

    @FXML
    void cancelClicked() {
            Stage window = (Stage) contact.getScene().getWindow();
            window.close();
    }

    @FXML
    void submit(ActionEvent event) throws ClassNotFoundException, SQLException {
        String donator = name.getText();
        String bloodGroup = bGroup.getText();
        String lastDonations = lastDonation.getText();
        String contacts = contact.getText();
        
       
        System.out.println(donator+bloodGroup+lastDonations+contacts);
        
        SQL sql = new SQL();
        //sql.writeDB("insert into userdata(username,password) values (\""+"ttryrty"+"\",\""+"tyujtyu"+"\")");
        sql.writeDB("insert into bloodbank(Name,BloodGroup, LastDonation, Contact) values (\""+donator+"\",\""+bloodGroup+"\",\""+lastDonations+"\",\""+contacts+"\")");
        Stage window = (Stage) contact.getScene().getWindow();
        window.close();
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
