package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        //поменяй потом то что в кавычках на "authorization.fxml"
        primaryStage.setTitle("Авторизация");
        primaryStage.setScene(new Scene(root, 1000, 691));
        primaryStage.setResizable(false);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
