package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class registerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField RegisterUserField;

    @FXML
    private PasswordField RegisterPasswordField;

    @FXML
    private Button RegisterRegisterButton;

    @FXML
    private TextField RegisterNameField;

    @FXML
    private TextField RegisterLastNameField;

    @FXML
    private TextField RegisterCountryField;

    @FXML
    private CheckBox RegisterMaleCheckBox;

    @FXML
    private CheckBox RegisterFemaleCheckBox;

    @FXML
    void initialize() {
        RegisterRegisterButton.setOnAction(event -> {

            registerNewUser();

        });

    }

    private void registerNewUser() {

        databaseHandler dbHandler = new databaseHandler();

        String firstName = RegisterNameField.getText();
        String lastName = RegisterLastNameField.getText();
        String userName = RegisterUserField.getText();
        String password = RegisterPasswordField.getText();
        String country = RegisterCountryField.getText();
        String gender = "Unisex";
        if(RegisterMaleCheckBox.isSelected()) gender = "Male";
        else gender = "Female";

        User user = new User(firstName,
                lastName,
                userName,
                password,
                country,
                gender);

        dbHandler.registerUser(user);
    }
}
