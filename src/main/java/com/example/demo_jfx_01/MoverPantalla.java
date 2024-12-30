package com.example.demo_jfx_01;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;


public interface MoverPantalla {

    default void onMoverPatalla(AnchorPane panelFather, Stage stage) {
        try {
            AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
            AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);
            System.out.println("Atomic");

            panelFather.setOnMousePressed(e -> {
                //Stage stage = (Stage) panelFather.getScene().getWindow();
                xOffset.set(stage.getX() - e.getScreenX());
                yOffset.set(stage.getY() - e.getScreenY());
            });

            System.out.println("Pressed");

            panelFather.setOnMouseDragged(e -> {
                //Stage stage = (Stage) panelFather.getScene().getWindow();
                stage.setX(e.getScreenX() + xOffset.get());
                stage.setY(e.getScreenY() + yOffset.get());
                //panelFather.setStyle("-fx-cursor: CLOSED_HAND;");
            });
            System.out.println("Dragged");

            //panelFather.setOnMouseReleased(e -> panelFather.setStyle("-fx-cursor: DEFAULT;"));
        } catch (Exception e) {
            throw new RuntimeException("Excepción del código MoverPantalla" + e);
        }


    }
}
