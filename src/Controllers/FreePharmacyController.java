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

public class FreePharmacyController implements Initializable {

    @FXML
    private TableView<ffRow> table;

    @FXML
    private TableColumn<ffRow, String> drugname;

    @FXML
    private TableColumn<ffRow, String> quantity;

    @FXML
    private TableColumn<ffRow, String> expireDate;

    @FXML
    private TableColumn<ffRow, String> contact;

    @FXML
    private Button donate;

    @FXML
    private Button find;
    
    @FXML
    void refreshClicked() {
        drugname.setCellValueFactory(new PropertyValueFactory<>("drugname"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        expireDate.setCellValueFactory(new PropertyValueFactory<>("expireDate"));
        contact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        System.out.println("in it");
        table.setItems(getRow());
    }
    
    @FXML
    void closeClicked() {
         System.out.println("Exit clicked");
         try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Welcome.fxml"));
           
            Stage window = (Stage) find.getScene().getWindow();
            
            window.setScene(new Scene(root, 1200, 700));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        refreshClicked();
    }

    public ObservableList<ffRow> getRow() {
        ObservableList<ffRow> list = FXCollections.observableArrayList();

        try {
            SQL sql = new SQL();
            ResultSet answer = sql.readDB("select * from freepharmacy");

            while (answer.next()) {
                {
                    list.add(new ffRow(answer.getString(1), answer.getString(2), answer.getString(3), answer.getString(4)));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BloodBankController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BloodBankController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    @FXML
    void donateClicked(ActionEvent event) {
        System.out.println("Works");
        try {
            Parent root =(Parent)  FXMLLoader.load(getClass().getResource("/UI/FFDonateForm.fxml"));
            Stage window = new Stage();
            window.setScene(new Scene(root, 600, 500));
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void findClicked(ActionEvent event) {

    }

}
