package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class otchetyController {

    @FXML
    private AnchorPane pane;

    @FXML
    private Label otchety_text; //отчёты

    @FXML
    private Button back_to_menu; //кнопка назад

    @FXML
    private ImageView purple_arrow; //картинка в кнопке

    @FXML
    private Label kolvo_text; //количество зарегистрированных посетителей сотрудником

    @FXML
    private ComboBox<?> sotrudnic; //сотрудник

    @FXML
    private Label kolvo; //458676567

    @FXML
    private Label za; //за

    @FXML
    private ComboBox<?> period; //период

    @FXML
    private Label year; //2048557684

    @FXML
    private Label year_text; //года

    @FXML
    private Label pribil_text; //денежная прибыль составила

    @FXML
    private Label pribil; //99 000 000

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

}