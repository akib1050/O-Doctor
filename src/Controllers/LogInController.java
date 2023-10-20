/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Controllers.SQL.answer;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class LogInController implements Initializable {

    @FXML
    public Button login;
    public Button signupButton;
    
    public TextArea username;
    public PasswordField password;
    
    boolean match = false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    
    public void loginclicked() throws SQLException, ClassNotFoundException{
        String inputUsername = username.getText();
        String inputPassword = password.getText();
        String userType = new String();
        
        SQL sql = new SQL();
        ResultSet answer = sql.readDB("select * from users");
                
        while(answer.next()){
            if(inputUsername.equals(answer.getString("Username"))){
                if(inputPassword.equals(answer.getString("Password"))){
                    match = true;
                    userType = answer.getString("UserType");
                }
            }
        }
        if(match) {
            if(userType.equals("Patient"))
                gotoPatientHomePage();
            else if(userType.equals("Doctor"))
                gotoDoctorHomePage();
        }
        else
            System.out.println("Not Matched!!!!");
    }
    
    public void gotoPatientHomePage(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/PatientHome.fxml"));
            Stage window = (Stage) login.getScene().getWindow();
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void gotoDoctorHomePage(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/DoctorHome_1.fxml"));
            Stage window = (Stage) login.getScene().getWindow();
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @FXML
    public void signupClicked() throws Exception {
         System.out.println("Sign up clicked");
         try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Sign up.fxml"));
           
            Stage window = (Stage) signupButton.getScene().getWindow();
            
            window.setScene(new Scene(root, 1920, 1080));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void exitClicked() throws Exception {
         System.out.println("Exit clicked");
         try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Welcome.fxml"));
           
            Stage window = (Stage) signupButton.getScene().getWindow();
            
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        System.out.println(o.doctor.ODoctor.key);
    }
     
    public void gotoSignupPage(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Log in Pre.fxml"));
           
            Stage window = (Stage) signupButton.getScene().getWindow();
            
            window.setScene(new Scene(root, 1920, 1080));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
