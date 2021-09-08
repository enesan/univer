package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label size = new Label("Size of Array");
        size.setLayoutX(20);
        size.setLayoutY(30);

        ComboBox<Integer> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(100, 10_000, 50_000, 100_000, 500_000);
        comboBox.setLayoutX(20);
        comboBox.setLayoutY(50);

        RadioButton rb1 = new RadioButton("successively");
        RadioButton rb2 = new RadioButton("parallely");
        rb1.setLayoutX(20);
        rb1.setLayoutY(100);
        rb2.setLayoutX(20);
        rb2.setLayoutY(120);

        Button startButton = new Button("startSorting");
        startButton.setLayoutX(20);
        startButton.setLayoutY(150);

        Label[] names = {
                new Label("Quick sort: "),
                new Label("Merge sort: "),
                new Label("Pyramidal sort: "),
        };
        names[1].setLayoutX();

        Label[] stats = {
                new Label("com. =  "),
                new Label("sw. =  "),
                new Label("sec. =  ")
        };

        int taWidth = 120;
        int taHeight = 200;
        TextArea[] textAreas = {new TextArea("первая"), new TextArea("вторая"), new TextArea("third")};
        textAreas[0].setPrefSize(taWidth, taHeight);
        textAreas[1].setPrefSize(taWidth, taHeight);
        textAreas[2].setPrefSize(taWidth, taHeight);
        textAreas[1].setLayoutX(140);
        textAreas[2].setLayoutX(280);

        Group textGroup = new Group(textAreas);
        Group labelsNames = new Group(names);
        Group labelsStats = new Group(stats);
        textGroup.setLayoutX(160);
        textGroup.setLayoutY(40);
        labelsNames.

        AnchorPane root = new AnchorPane(textGroup, labelsNames, labelsStats,
                size, comboBox, rb1, rb2, startButton);

        Scene scene = new Scene(root, 640, 350);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {

        super.stop();
        System.out.println("stop");

    }


}
