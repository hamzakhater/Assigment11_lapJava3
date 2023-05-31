package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FxController2 {

    @FXML
    private TextField textNIS;

    @FXML
    private Label lable_error;

    @FXML
    private TextField text_USD;

    @FXML
    private AnchorPane Sc2;

    @FXML
    void btn_Convert(ActionEvent event) {
        String usd = text_USD.getText();
        String NIs = textNIS.getText();
        if (!usd.isEmpty()) {
            textNIS.setText("" + Double.parseDouble(text_USD.getText()) * 3.66);
            lable_error.setText(null);
        } else if (!NIs.isEmpty()) {
            text_USD.setText("" + Double.parseDouble(textNIS.getText()) / 3.66);
            lable_error.setText(null);
        } else {
            lable_error.setText("Please enter the value to be converted");
        }
    }

    @FXML
    void btn_Logout(ActionEvent event) throws IOException {
        AnchorPane c = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Sc2.getChildren().removeAll();
        Sc2.getChildren().setAll(c);
    }

}
