/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class DoctorHomeController implements Initializable {

    
    @FXML
    Button message;
    BorderPane mainPane;
    Pane view;
    BorderPane root;
    
    @FXML
    Label TextMessage;
    
    
    public Pane getPane() {

	try {
		URL fileUrl = getClass().getResource("/UI/PatientDashboard.fxml");
		
		if(fileUrl == null) {
			throw new java.io.FileNotFoundException("FXML file can't be found.");
		}

		view = new FXMLLoader().load(fileUrl);
		
	}	catch (Exception e) {
			
		}

	return view;
}
    @FXML
    public void prescriptionClicked() throws IOException {
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
    void writeClicked(ActionEvent event) throws ClassNotFoundException, SQLException {
        
        try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/DoctorsMessage.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root, 600, 400));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @FXML
    public void messageClicked() {
        System.out.println("Worked");
        
        try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/DoctorsMessage.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root, 600, 400));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void adminClicked() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/UI/Welcome.fxml"));
            Stage window = (Stage) message.getScene().getWindow();
            window.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public void appointmentClicked() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/UI/Appointment.fxml"));
            Stage window = (Stage) message.getScene().getWindow();
            window.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}





