package com.example.demo_jfx_01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.*;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        try{
            stage.initStyle(StageStyle.TRANSPARENT);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("selenium_sicj.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 600);
            scene.setFill(Color.TRANSPARENT);
            //stage.initStyle(StageStyle.DECORATED.UNDECORATED);

            //stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        launch();
    }
}