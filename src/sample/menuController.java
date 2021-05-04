package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    @FXML
    private ImageView fat_line;

    @FXML
    private ImageView thin_line;

    @FXML
    private Button rooms;

    @FXML
    private Label fio;

    @FXML
    private Button otchety;

    @FXML
    private Button redact;

    @FXML
    private Button add;

    @FXML
    private Button exit;

    @FXML
    void go_add(ActionEvent event)  throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) add.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("regist_sotrud.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Зарегистрировать нового сотрудника");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void go_authorization(ActionEvent event)  throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) exit.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("authorization.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Авторизация");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void go_otchety(ActionEvent event)  throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) otchety.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("otchety.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Отчёты");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void go_redact(ActionEvent event)  throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) redact.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("redact_sotrud.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Редактировать информацию о сотруднике");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void go_rooms(ActionEvent event)  throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) rooms.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("rooms.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Информация о номерах");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}
