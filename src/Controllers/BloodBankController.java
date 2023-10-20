/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import UI.bbRow;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
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

public class BloodBankController implements Initializable {

    @FXML
    private TableView<bbRow> table;

    @FXML
    private TableColumn<bbRow, String> username;

    @FXML
    private TableColumn<bbRow, String> group;

    @FXML
    private TableColumn<bbRow, String> lastDonation;

    @FXML
    private TableColumn<bbRow, String> contact;

    @FXML
    private Button donate;

    @FXML
    private Button find;
    
    @FXML
    private Button close;

    @FXML
    void closeClicked(ActionEvent event) {
         System.out.println("Exit clicked");
         try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Welcome.fxml"));
           
            Stage window = (Stage) close.getScene().getWindow();
            
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void donateClicked(ActionEvent event) {
        System.out.println("works");
        try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/BBDonateForm.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root, 600, 450));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void find(ActionEvent event) {

    }
    
    @FXML
    void refreshClicked() {
            username.setCellValueFactory(new PropertyValueFactory<>("name"));
            group.setCellValueFactory(new PropertyValueFactory<>("group"));
            lastDonation.setCellValueFactory(new PropertyValueFactory<>("lastdonation"));
            contact.setCellValueFactory(new PropertyValueFactory<>("contact"));
            System.out.println("in it");
            table.setItems(getRow());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            refreshClicked();
    }
    
    

    public ObservableList<bbRow> getRow() {
        ObservableList<bbRow> list = FXCollections.observableArrayList();

        try {
            SQL sql = new SQL();
            ResultSet answer = sql.readDB("select * from bloodbank");

            while (answer.next()) {
                {
                    list.add(new bbRow(answer.getString(1), answer.getString(2), answer.getString(3), answer.getString(4)));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodBankController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BloodBankController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
