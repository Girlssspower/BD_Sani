package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class roomsController {

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
        Stage stage = (Stage)  back_to_menu.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Меню");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void go_info(ActionEvent event) throws IOException {
        Stage stage = (Stage)  num_2.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("number_info.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Информация о номере");
        stage.setScene(new Scene(root));
        stage.show();

    }

}