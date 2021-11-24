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

public class AirTicketBooking extends Application {
    TextField source , destination , depardate , passengers , type;

    public static void main(String[] args){
        System.out.println("Name : Suraj Kumar");
        System.out.println("Registration Number : 20BCE2835");
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Book");
        source = new TextField("Enter the source");
        destination = new TextField("Enter the destination");
        depardate = new TextField("Enter the departure date");
        passengers = new TextField("Enter the number of passengers");
        type = new TextField("Enter the class");

        VBox layout = new VBox();
        layout.getChildren().addAll(button, source, destination, depardate, passengers, type);
        Scene scene = new Scene(layout , 400 , 400);
        stage.setScene(scene);
        stage.show();


        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                VBox output = new VBox();
                Label l1, l2, l3, l4 ,l5;
                l1 = new Label();
                l2 = new Label();
                l3 = new Label();
                l4 = new Label();
                l5 = new Label();
                l1.setText(source.getText());
                l2.setText(destination.getText());
                l3.setText(depardate.getText());
                l4.setText(passengers.getText());
                l5.setText(type.getText());
                output.getChildren().addAll(l1, l2, l3, l4, l5);
                Scene scene1 = new Scene(output , 400 , 400);
                stage.setScene(scene1);
                stage.show();
            }
        });
    }
}
