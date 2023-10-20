package o.doctor;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ODoctor extends Application {
    
    public static int key = 1;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/UI/Welcome.fxml"));
            Scene scene = new Scene(root, 1200, 700);
            primaryStage.setTitle("Home Page");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("!!!!Main!!!!");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }   
}
