package Controllers;

import java.io.File;
import java.io.IOException;
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

public class SignUpController implements Initializable {

    @FXML
    public TextField age;
    public CheckBox patient, doctor, stuff;
    public TextField disease1;
    public TextField disease2;
    public TextField disease3;
    public TextField disease4;
    public TextField disease5;
    public TextField email;
    public TextField cellPhone;
    public TextField username;
    public PasswordField password;
    public TextField firstName, lastName;
    public TextField bloodGroup;

    public Button signButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void gotoLoginPage() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/UI/Log in pre.fxml"));
            Stage window = (Stage) signButton.getScene().getWindow();
            window.setScene(new Scene(root, 1920, 1080));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    SQL sql;

    @FXML
    public void signupClicked(ActionEvent e) throws ClassNotFoundException, SQLException, IOException {

        String usertype = "";
        boolean isPatient = patient.isSelected();
        boolean isDoctor = doctor.isSelected();
        boolean isStuff = stuff.isSelected();

        if (isPatient) {
            usertype = "Patient";
        } else if (isDoctor) {
            usertype = "Doctor";
        } else if (isStuff) {
            usertype = "Stuff";
        }

        System.out.println(usertype);

        

        //    sql.writeDB("insert into users(First Name, Last Name, Disease, Email Address, Cell Phone, Username, Password) values (\""+tanim1+"\",\""+tanim2+"\"\""+tanim2+"\"\""+tanim2+"\"\""+tanim2+"\"\""+tanim2+"\"\""+tanim2+"\")");
      
        String fName = firstName.getText();
        String lName = lastName.getText();
        String disease = disease1.getText() + " " + disease2.getText() + " " + disease3.getText() + " " + disease4.getText() + " " + disease5.getText();
        String email = (this.email).getText();
        String phone = cellPhone.getText();
        String username = (this.username).getText();
        String password = (this.password).getText();
        String bloodgroup = (this.bloodGroup).getText();
        
        sql = new SQL();

        System.out.println(fName + " " + lName + " " + disease + " " + email + " " + phone + " " + username + " " + password);

        sql.writeDB("insert into users(FirstName, LastName, Disease, EmailAddress, CellPhone, Username, Password, Age, BloodGroup, UserType) values "
                + "(\"" + fName + "\",\"" + lName + "\",\"" + disease + "\",\"" + email + "\",\"" + phone + "\",\"" + username + "\",\"" + password + "\",\"" + age.getText() + "\",\"" + bloodgroup + "\",\"" + usertype + "\")");
        sql.writeDB("insert into messages(Username, Message1, Message2, Message3, Message4, Message5) values " + "(\"" + username + "\",\"" + "1" + "\",\"" + "" + "\",\"" +"" + "\",\"" + "" + "\",\"" + ""+ "\")");
        
        gotoLoginPage();
    }
    
    //Getter method
    public SQL getDatabase() {
        return sql;
    }
}
