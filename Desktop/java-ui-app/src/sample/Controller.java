package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Arrays;
import java.util.Optional;


public class Controller {

//    private  Game game;
//    private int step;

    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

//    public Controller() {
//        game = new Game();
//        step = 0;
//    }


    public void buttonSendClick(ActionEvent actionEvent) {
        textArea.setText(textArea.getText() + textField.getText());
        textField.setText(" ");
        textField.requestFocus();
        textArea.setScrollTop(Double.MAX_VALUE);

    }




//    public void buttonSendClick(ActionEvent actionEvent) {
//
//        String playerNumber = textField.getText();
//        Game.BullsAndCowsCount bullsAndCows = game.calculateBullsAndCows(playerNumber);
//        String result = String.format("%d - Input digit %s \n bulls %d cows %d \n",
//                ++step,
//                playerNumber,
//                bullsAndCows.getBulls(),
//                bullsAndCows.getCows());
//        textArea.setText(textArea.getText() + result);
//        textField.setText(" ");
//        textField.requestFocus();
//        textArea.setScrollTop(Double.MAX_VALUE);
//        if (bullsAndCows.getBulls() == 4 ) {
//            if (isWantToPlayAgain()) {
//                textArea.setText(" ");
//                step =0;
//                game = new Game();
//            } else {
//                System.exit(0);
//            }
//        }
//
//    }

//    private boolean isWantToPlayAgain() {
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
//                "Congratulations you won!!! for  " + step + " steps\n" +
//                        " Guess number is " + Arrays.toString(game.getGuessNumber()) + ".\n" +
//                        "Do you want to play more ? ",
//                new ButtonType("YES" , ButtonBar.ButtonData.YES),
//                new ButtonType("NO" , ButtonBar.ButtonData.NO));
//
//        alert.setTitle(" I have A question");
//        ButtonType  answer = alert.showAndWait().get();
//        return answer.getButtonData() == ButtonBar.ButtonData.YES;
//    }



//    public void menuNewGameSelect(ActionEvent actionEvent) {
//
//    }

    public void menuExitChatSelect(ActionEvent actionEvent) {
        System.exit(0);
    }
}


