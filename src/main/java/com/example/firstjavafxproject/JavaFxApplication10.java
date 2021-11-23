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
    TextField username , password;
    Label l1 , l2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Click me");
        Button b2 = new Button("Red");
        username = new TextField("Enter the username");
        password = new TextField("Enter the password");
        l1 = new Label();
        l2 = new Label();
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                l1.setText("This is my label");
                System.out.println("Welcome to Java Fx");
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
                           @Override
                           public void handle(ActionEvent actionEvent) {
                               l2.setText("Red!");
                               System.out.println("Red color");
                           }
                       });

                VBox layout = new VBox();
        layout.getChildren().addAll(username, password, b1, b2, l2, l1);
        Scene scene = new Scene(layout , 400 , 400);
        stage.setScene(scene);
        stage.show();
    }
}
