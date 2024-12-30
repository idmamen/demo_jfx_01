package com.example.demo_jfx_01;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;


public interface MoverPantalla {

    default void onMoverPatalla(AnchorPane panelFather, Stage stage) {
        try {
            AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
            AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);

            System.out.println("xOffset: " + xOffset);
            System.out.println("yOffset: " + yOffset);

            AtomicInteger x = new AtomicInteger();

            //esto no me funciona en mi ordenador...
            panelFather.setOnMousePressed(e -> {
                //Stage stage = (Stage) panelFather.getScene().getWindow();
                xOffset.set(stage.getX() - e.getScreenX());
                yOffset.set(stage.getY() - e.getScreenY());

            });

            panelFather.setOnMouseDragged(e -> {
                //... por lo que pongo esto para tomar la posición del raton y de la pantalla y que no se me mueva el ratón a la esquina
                if (x.get() ==0){
                    xOffset.set(stage.getX() - e.getScreenX());
                    yOffset.set(stage.getY() - e.getScreenY());
                    x.set(1);
                }
                //Stage stage = (Stage) panelFather.getScene().getWindow();
                stage.setX(e.getScreenX() + xOffset.get());
                stage.setY(e.getScreenY() + yOffset.get());

                //panelFather.setStyle("-fx-cursor: CLOSED_HAND;");
            });


            //panelFather.setOnMouseReleased(e -> panelFather.setStyle("-fx-cursor: DEFAULT;"));
        } catch (Exception e) {
            throw new RuntimeException("Excepción del código MoverPantalla" + e);
        }


    }
}
