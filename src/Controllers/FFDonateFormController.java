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


public class FFDonateFormController implements Initializable {
    
     @FXML
    private TextArea name;

    @FXML
    private TextArea quantity;

    @FXML
    private TextArea expdate;

    @FXML
    private TextArea contact;
    
    @FXML
    void cancel(ActionEvent event) {
        Stage window = (Stage) contact.getScene().getWindow();
        window.close();
    }

    @FXML
    void submitClicked(ActionEvent event) throws ClassNotFoundException, SQLException {
        String donator = name.getText();
        String quantities = quantity.getText();
        String expireDate = expdate.getText();
        String contacts = contact.getText();
        System.out.println("FF");
       
        System.out.println(donator+quantities+expireDate+contacts);
        
        SQL sql = new SQL();
        //sql.writeDB("insert into userdata(username,password) values (\""+"ttryrty"+"\",\""+"tyujtyu"+"\")");
        sql.writeDB("insert into freepharmacy(Drug, Quantity, ExpireDate, Contact) values (\""+donator+"\",\""+quantities+"\",\""+expireDate+"\",\""+contacts+"\")");
        Stage window = (Stage) contact.getScene().getWindow();
        window.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
