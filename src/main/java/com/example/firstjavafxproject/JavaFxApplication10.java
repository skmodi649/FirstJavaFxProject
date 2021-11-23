package com.example.firstjavafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxApplication10 extends Application {
    Label l1;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("green");
        Button b2 = new Button("red");
        Button b3 = new Button("blue");
        Button b4 = new Button("pink");
        Button b5 = new Button("black");
        l1 = new Label();
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("Green color!");
                b1. setStyle("-fx-background-color: #00FF00; ");
                System.out.println("Green color!");
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
                           @Override
                           public void handle(ActionEvent actionEvent) {
                               l1.setText("Red color!");
                               b2.setStyle("-fx-background-color: #FF0000; ");
                               System.out.println("Red color!");
                           }
                       });

        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("Blue color!");
                b3.setStyle("-fx-background-color: #0000FF; ");
                System.out.println("Blue color!");
            }
        });

        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("Pink color!");
                b2.setStyle("-fx-background-color: #FFC0CB; ");
                System.out.println("Pink color!");
            }
        });

        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("Black color!");
                b5.setStyle("-fx-background-color: #000000; ");
                System.out.println("Black color!");
            }
        });

                VBox layout = new VBox();
        layout.getChildren().addAll(b1, b2, b3, b4,b5, l1);
        Scene scene = new Scene(layout , 400 , 400);
        stage.setScene(scene);
        stage.show();
    }
}
