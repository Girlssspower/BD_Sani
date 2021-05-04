package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
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
        Stage stage = (Stage) add.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("regist_sotrud.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Зарегистрировать нового сотрудника");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void go_authorization(ActionEvent event)  throws IOException {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("authorization.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Авторизация");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void go_otchety(ActionEvent event)  throws IOException {
        Stage stage = (Stage) otchety.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("otchety.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Отчёты");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void go_redact(ActionEvent event)  throws IOException {
        Stage stage = (Stage) redact.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("redact_sotrud.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Редактировать информацию о сотруднике");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void go_rooms(ActionEvent event)  throws IOException {
        Stage stage = (Stage) rooms.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("rooms.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Информация о номерах");
        stage.setScene(new Scene(root));
        stage.show();

    }

}
