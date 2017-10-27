/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author client
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton perempuan;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton laki;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField BB;
    @FXML
    private JFXTextField TB;
    @FXML
    private JFXTextField hasilBB;
    @FXML
    private JFXTextArea Hasil;
    @FXML
    private JFXTextArea Saran;
    @FXML
    private Button proses;
    
    
    @FXML
    private Button reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
    int HasilBB = 0;
    String Nama = nama.getText();
    int TinggiBadan = Integer.parseInt(TB.getText());
    int BeratBadan = Integer.parseInt(BB.getText());
    
    if (laki.isSelected()){
        HasilBB = TinggiBadan -100;
        hasilBB.setText(""+HasilBB);
        
        if (HasilBB == parseInt(TB.getText())){
            Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" ideal ") ;
            Saran.setText("tetap pertahankan"); 
        }
        else if (HasilBB > parseInt(TB.getText())){
            Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" Overweight ") ;
            Saran.setText("Kurangi makan malam & ngemil"); 
     
        }
        else if (HasilBB < parseInt(TB.getText())){
           Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" Underweight ") ;
           Saran.setText("Sering-sering makan"); 
            
        }
    
    }
   
        if(perempuan.isSelected()) {
        HasilBB = parseInt(TB.getText()) -110;
        
        hasilBB.setText(""+HasilBB);
   if (HasilBB == parseInt(TB.getText())){
            Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" ideal ") ;
            Saran.setText("tetap pertahankan"); 
        }
        else if (HasilBB > parseInt(TB.getText())){
            Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" Overweight ") ;
            Saran.setText("Kurangi makan malam & ngemil"); 
     
        }
        else if (HasilBB < parseInt(TB.getText())){
           Hasil.setText("nama:  "+nama.getText()+ " Tinggi:  "+TB.getText()+" Underweight ") ;
           Saran.setText("Sering-sering makan"); 
            
        }
   
    }
    }

    @FXML
    void buttonReset(ActionEvent event) {
        nama.setText("");
        TB.setText("");
        BB.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
        hasilBB.setText("");
        Hasil.setText("");
        Saran.setText("");
    }
    }
    

