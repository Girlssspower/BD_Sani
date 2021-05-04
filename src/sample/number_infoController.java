package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class number_infoController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView fat_line; //толстая фиолетовая линия

    @FXML
    private ImageView thin_line; //тонкая фиолетовая линия

    @FXML
    private Button bron; //кнопка

    @FXML
    private TextField surname; //фамилия

    @FXML
    private TextField name; //имя

    @FXML
    private TextField last_name; //отчество

    @FXML
    private DatePicker birth_date; //дата рождения

    @FXML
    private ImageView birth_date_image; //календарь в birth_date

    @FXML
    private ComboBox<?> document_type; //тип документа

    @FXML
    private Label info_room; //информация о номере

    @FXML
    private Label num_room; //100500

    @FXML
    private Label category; //категория

    @FXML
    private Label category_value; //10 звёзд

    @FXML
    private Label status; //статус

    @FXML
    private Label status_value; //свободен, крошка ;)

    @FXML
    private Label fee_day; //стоимость в сутки

    @FXML
    private Label fee_day_value; //ты нищеброд

    @FXML
    private DatePicker go; //дата заезда

    @FXML
    private ImageView go_image; //календарь в go

    @FXML
    private DatePicker leave; //дата выезда

    @FXML
    private ImageView leave_image; //календарь в leave

    @FXML
    private Label sum_text; //сумма к оплате

    @FXML
    private Label sum; //1 000 000$

    @FXML
    private Button back; //кнопка назад

    @FXML
    private ImageView purple_arrow; //картинка на кнопке назад

    @FXML
    void bron_room(ActionEvent event) {

    }

    @FXML
    void back_to_menu(ActionEvent event) throws IOException  {
        Stage stage;
        Parent root;

        stage = (Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("rooms.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Информация о номерах");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }
}