package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class authorizationController {

    @FXML
    private AnchorPane pane;

    @FXML
    private ImageView fat_line;

    @FXML
    private ImageView thin_line;

    @FXML
    private Button authorization;

    @FXML
    private Label hello_text;

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    private PasswordField password_password;

    @FXML
    private Button open_eye;

    @FXML
    private Button close_eye;

    @FXML
    void authorize_me(ActionEvent event) throws IOException {

        //это код, который при нажатии на кнопку войти откроет форму "меню"

//        Stage stage;
//        Parent root;
//
//        stage = (Stage) authorization.getScene().getWindow();
//        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
//        Scene scene = new Scene(root);
//        stage.setTitle("Меню");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();


    }

    //глаза у меня не получились, прости меня - бездарную, но я пробовала и так, как мы делали
    //в колледж хелпере, и по нажатию на определённый глаз скрывать всё, что не надо. Нихуя
    //у меня не получилось, поэтому простиизвини :(((((

    @FXML
    void change_eye_on_close(ActionEvent event) {
//        password.setText(password_password.getText());
//        password_password.setVisible(false);
//        open_eye.setVisible(false);
//        close_eye.setVisible(true);

        password.setText(password_password.getText());
        pane.getChildren().remove(password_password);
        pane.getChildren().add(password);
        pane.getChildren().remove(open_eye);
        pane.getChildren().add(close_eye);
    }


    @FXML
    void change_eye_on_open(ActionEvent event) {
//        password_password.setText(password.getText());
//        password_password.setVisible(false);
//        close_eye.setVisible(false);
//        open_eye.setVisible(true);

        password_password.setText(password.getText());
        pane.getChildren().remove(password);
        pane.getChildren().add(password_password);
        pane.getChildren().remove(close_eye);
        pane.getChildren().add(open_eye);
    }

}