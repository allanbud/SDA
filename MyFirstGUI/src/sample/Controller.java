package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import sample.animations.Shake;

import javax.activation.DataHandler;
import javax.xml.transform.Result;

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
            openNewWindow("/sample/register.fxml");
        });

    }

    private void loginUser(String loginText, String loginPassword) {
        databaseHandler dbHandler = new databaseHandler();
        User user = new User();

        user.setUserName(loginText);
        user.setPassword(loginPassword);

        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        try {
            while(result.next()) {
                counter++;
            }
                } catch (SQLException e) {
                    e.printStackTrace();
                }




        if(counter >= 1) {
            openNewWindow("/sample/app.fxml");
        }
        else {
            Shake userLoginAnimation = new Shake(LoginUserField);
            Shake userPasswordAnimation = new Shake(LoginPasswordField);
            userLoginAnimation.playAnimation();
            userPasswordAnimation.playAnimation();
        }
    }

   public void openNewWindow(String window){
       LoginRegisterButton.getScene().getWindow().hide();
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource(window));
       try {
           loader.load();
       } catch (IOException e) {
           e.printStackTrace();
       }

       Parent root = loader.getRoot();
       Stage stage = new Stage();
       stage.setScene(new Scene(root));
       stage.showAndWait();

   }


}
