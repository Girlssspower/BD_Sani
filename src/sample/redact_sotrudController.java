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

public class redact_sotrudController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView fat_line;

    @FXML
    private ImageView thin_line;

    @FXML
    private Button redaction;

    @FXML
    private TextField surname;

    @FXML
    private TextField name;

    @FXML
    private Label regist_text;

    @FXML
    private DatePicker birth_date;

    @FXML
    private TextField last_name;

    @FXML
    private ComboBox<?> dolzhnost;

    @FXML
    private ImageView birth_date_image;

    @FXML
    private TextField telephone;

    @FXML
    private TextField email;

    @FXML
    private TextField education;

    @FXML
    private TextField passport_data;

    @FXML
    private ComboBox<?> status;

    @FXML
    private Button back_to_menu;

    @FXML
    private ImageView purple_arrow;


    @FXML
    void redact_sotrud(ActionEvent event) {

    }

    @FXML
    void back_to_menu(ActionEvent event) throws IOException {
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

}