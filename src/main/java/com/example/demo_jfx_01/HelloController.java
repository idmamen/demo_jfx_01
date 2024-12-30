package com.example.demo_jfx_01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.print.PageLayout;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloController implements MoverPantalla{


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


    @FXML
    private AnchorPane pantallaInicio;

    @FXML
    private void clickMoverPantalla(){
        Stage stage = (Stage) this.pantallaInicio.getScene().getWindow();
        System.out.println("stage creado");
        try{
            this.onMoverPatalla(this.pantallaInicio, stage);
        } catch (Exception e) {
            throw new RuntimeException("Excepción en Función clickMoverPantalla" + e);
        }


    }

}