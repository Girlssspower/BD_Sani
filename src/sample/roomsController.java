package sample;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class roomsController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView thin_line; //фиолетовая линия сбоку

    @FXML
    private Button button_grey; //кнопка, которая становится серой

    @FXML
    private ImageView star1; //звезда на 1 кнопке

    @FXML
    private ImageView star2; //звезда на 1 кнопке

    @FXML
    private ImageView star3; //звезда на 1 кнопке

    @FXML
    private Button num_2; //вторая цветная кнопка

    @FXML
    private ImageView star_21; //звезда на 2 кнопке

    @FXML
    private ImageView star_22; //звезда на 2 кнопке

    @FXML
    private ImageView star_23; //звезда на 2 кнопке

    @FXML
    private Button back_to_menu; //кнопка назад

    @FXML
    private ImageView arrow; //стрелка на кнопке назад


    @FXML
    void change(ActionEvent event) {
        button_grey.setStyle("-fx-background-color: #9f9f9f; -fx-text-fill: #cbcbcb; -fx-background-radius: 30; -fx-border-radius: 30;");
        star1.setImage(new Image("sample/sources/star_grey.png"));
        star2.setImage(new Image("sample/sources/star_grey.png"));
        star3.setImage(new Image("sample/sources/star_grey.png"));

        //1. изменяется цвет кнопки, цвет текста на кнопке и заново задаются круглые углы кнопки
        //2. в первом ImageView изменяется жёлтая звезда на новую картинку - серая звезда
        //3. во втором ImageView изменяется жёлтая звезда на новую картинку - серая звезда
        //4. в третьем ImageView изменяется жёлтая звезда на новую картинку - серая звезда
    }

    @FXML
    void back_to_menu(ActionEvent event) throws IOException {

//        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
//        Scene scene = back_to_menu.getScene();
//
//        root.translateYProperty().set(scene.getHeight());
//        pane.getChildren().add(root);
//
//        Timeline timeline = new Timeline();
//        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
//        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
//        timeline.getKeyFrames().add(kf);
//        timeline.setOnFinished(event1 -> {
//            pane.getChildren().remove(pane);
//        });
//        timeline.play();

    Stage stage;
    Parent root;

    stage = (Stage) back_to_menu.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("menu.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Меню");
    stage.setScene(scene);
    stage.setResizable(false);
    stage.show();




    }

    @FXML
    void go_info(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) num_2.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("number_info.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Информация о номере");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}