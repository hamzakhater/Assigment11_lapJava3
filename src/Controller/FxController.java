package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FxController {

    @FXML
    private TextField textPassWord;

    @FXML
    private TextField textUserName;

    @FXML
    private Label textError;

    @FXML
    private AnchorPane Sc1;

    @FXML
    void btn_Login(ActionEvent event) throws IOException {
        if (textPassWord.getText().equals("1") && textUserName.getText().equals("1")) {
            //
            AnchorPane c = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
            Sc1.getChildren().removeAll();
            Sc1.getChildren().setAll(c);
        } else {
            textError.setText("Error in UserName or PassWord");
        }
    }

}