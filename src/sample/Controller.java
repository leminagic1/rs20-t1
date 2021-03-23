package sample;


import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

public class Controller {

    public Label labela;

    public void Promjena (ActionEvent actionEvent){

        labela.setText("`Hello World!’");

        labela.setStyle("-fx-background-color: #6098e0");

    }

}

