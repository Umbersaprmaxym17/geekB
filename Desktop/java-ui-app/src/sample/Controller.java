package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    private  Game game;

    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

    public Controller() {
        game = new Game();
    }



    public void buttonSendClick(ActionEvent actionEvent) {
         String text = textArea.getText()  + textField.getText() + "\n" ;
         textField.setText(" ");
         textField.requestFocus();
         textArea.setText(text);
         textArea.setScrollTop(Double.MAX_VALUE);

    }
}
