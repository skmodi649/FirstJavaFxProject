package com.example.firstjavafxproject;

// Write a program that displays four lines of text in four Labels:
// Write your name, ID, Address, Phone in labels respectively.
// Set the background of the labels to white.
// Set the text color of the labels to black, blue, cyan, green respectively.
// Set the font of each label to TimesRoman, bold, and 20 pixels.
// Set the border of each label to a line border with yellow color.
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class LabelDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Label nameLabel = new Label("jklasdf ");
        nameLabel.setTextFill(javafx.scene.paint.Color.BLACK);
        nameLabel.setFont(javafx.scene.text.Font.font("TimesRoman", javafx.scene.text.FontWeight.BOLD, 20));
        nameLabel.setStyle("-fx-border-color: yellow;");
        nameLabel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label idLabel = new Label("asdfsdf ");
        idLabel.setTextFill(javafx.scene.paint.Color.BLUE);
        idLabel.setFont(javafx.scene.text.Font.font("TimesRoman", javafx.scene.text.FontWeight.BOLD, 20));
        idLabel.setStyle("-fx-border-color: yellow;");
        idLabel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label addressLabel = new Label("asdasdf ");
        addressLabel.setTextFill(javafx.scene.paint.Color.CYAN);
        addressLabel.setFont(javafx.scene.text.Font.font("TimesRoman", javafx.scene.text.FontWeight.BOLD, 20));
        addressLabel.setStyle("-fx-border-color: yellow;");
        addressLabel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label phoneLabel = new Label("0123456712 ");
        phoneLabel.setTextFill(javafx.scene.paint.Color.GREEN);
        phoneLabel.setFont(javafx.scene.text.Font.font("TimesRoman", javafx.scene.text.FontWeight.BOLD, 20));
        phoneLabel.setStyle("-fx-border-color: yellow;");
        phoneLabel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        VBox layout = new VBox();
        layout.getChildren().addAll(nameLabel , idLabel , addressLabel , phoneLabel);
        Scene scene = new Scene(layout , 400 , 400);
        stage.setScene(scene);
        stage.show();
    }
}
