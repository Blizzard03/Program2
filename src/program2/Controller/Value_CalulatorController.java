/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package program2.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import program2.Model.Value_Models;
/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class Value_CalulatorController implements Initializable {
   Value_Models vm = new Value_Models();
   
    @FXML
    private TextField Value1_Text;
    @FXML
    private TextField Value2_Text;
    @FXML
    private TextField Value3_Text;
    @FXML
    private TextField Average_Text;
    @FXML
    private Button Calculate_Btn;
    @FXML
    private Button Cancel_Btn;
    @FXML
    private Button Quit_Btn;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
    }    
 
    
    
    @FXML
    private void Calculate_Btn_Click(ActionEvent event) {
        vm.setNilai1(Double.parseDouble(Value1_Text.getText()));
        vm.setNilai2(Double.parseDouble(Value2_Text.getText()));
        vm.setNilai3(Double.parseDouble(Value3_Text.getText()));
        vm.setRata((vm.getNilai1() + vm.getNilai2()+vm.getNilai3())/3);
        Average_Text.setText(String.valueOf(vm.getRata()));
    }

    @FXML
    private void Cancel_Btn_Click(ActionEvent event) {
        Value1_Text.setText("");
        Value2_Text.setText("");
        Value3_Text.setText("");
        Average_Text.setText("");
    }

    @FXML
    private void Quick_Btn_Click(ActionEvent event) {
        System.exit(0);
    }
    
}
