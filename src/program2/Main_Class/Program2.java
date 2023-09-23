/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package program2.Main_Class;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class Program2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/program2/Main_Menu/Value_Calulator.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("Average Calculator");
        stage.setResizable(false);
        stage.setIconified(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
