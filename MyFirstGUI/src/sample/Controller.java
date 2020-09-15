package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.xml.internal.bind.v2.TODO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button LoginRegisterButton;

    @FXML
    private TextField LoginUserField;

    @FXML
    private PasswordField LoginPasswordField;

    @FXML
    private Button LoginLoginButton;

    @FXML
    void initialize() {

        LoginLoginButton.setOnAction(event -> {
            String loginText = LoginUserField.getText().trim(); //trim removes unwanted spaces
            String loginPassword = LoginPasswordField.getText().trim();
                if (!loginText.equals("") || (!loginPassword.equals(""))) {
                    loginUser(loginText, loginPassword);
                } else {
                    //TODO create something for empty login or password
                    System.out.println("Empty login or password");
                }

        });



        LoginRegisterButton.setOnAction(event -> {
            LoginRegisterButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/register.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

    private void loginUser(String loginText, String loginPassword) {
    }
}
