package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class PatientInventoryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logout;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> drugname;

    @FXML
    private TableColumn<?, ?> quantity;

    @FXML
    private TableColumn<?, ?> expireDate;

    @FXML
    private TableColumn<?, ?> contact;

    @FXML
    private Button entry;

    @FXML
    private Button find;

    @FXML
    void dashboardClicked(ActionEvent event) {
           try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/PatientHome.fxml"));
            Stage window = (Stage) logout.getScene().getWindow();
            window.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void prescriptionClicked(ActionEvent event) {
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
    void deleteClicked(ActionEvent event) {

    }

    @FXML
    void entryClicked(ActionEvent event) {

    }

    @FXML
    void findClicked(ActionEvent event) {

    }

    @FXML
    void inventoryClicked(ActionEvent event) {

    }

    @FXML
    void logoutClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Log in pre.fxml"));
            Stage window = (Stage) logout.getScene().getWindow();
            
            window.setScene(new Scene(root, 1920, 1080));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void refreshClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
