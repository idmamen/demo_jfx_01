package com.example.demo_jfx_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {


    @FXML
    private Button btnSalir;



    @FXML
    private void HandleBtnSalir(ActionEvent event) {
        // Primera opcion
        // Node source = (Node) event.getSource();
        //Stage stage = (Stage) source.getScene().getWindow();
        //stage.close();

        // Segunda opcion
        Stage stage = (Stage) this.btnSalir.getScene().getWindow();
        stage.close();

    }



}