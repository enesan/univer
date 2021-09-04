package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Text text = new Text("Hello");
        text.setLayoutX(90);
        text.setLayoutY(100);

        Group group = new Group(text);

        Scene scene = new Scene(group, 200, 300);
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
