/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class AppointmentController implements Initializable {

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> username;

    @FXML
    private TableColumn<?, ?> lastDonation;

    @FXML
    private TableColumn<?, ?> contact;

    @FXML
    private TableColumn<?, ?> group;

    @FXML
    private Button find;

    @FXML
    private Button close;

    @FXML
    void closeClicked() {
        System.out.println("Called");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/DoctorHome_1.fxml"));
            Stage window = (Stage) close.getScene().getWindow();window.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void prescriptionClicked() {
        
    }
    
    @FXML
    void find(ActionEvent event) {

    }

    @FXML
    void refreshClicked(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
