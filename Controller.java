package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.String.format;

public class Controller {

    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    @FXML
    private TextField tf1;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Label lb3;

    @FXML
    private TextField tf2;

    @FXML
    private Button bt3;

    @FXML
    void celsius(ActionEvent event) {
        double f = parseDouble(tf1.getText());
        double cel =((f-32)*5)/9;
        tf2.setText(String.format(cel+"C"));
    }

    @FXML
    void fahrenheit(ActionEvent event) {
        double c = parseDouble(tf1.getText());
        double fah = ((c*9)/5)+32;
        tf2.setText(String.format(fah+"F"));
    }

    @FXML
    void clear(ActionEvent event) {
        tf1.setText("");
        tf2.setText("");
    }



}
