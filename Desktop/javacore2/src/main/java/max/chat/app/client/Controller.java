package max.chat.app.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Controller {

    @FXML
    private HBox clientPanel;
    @FXML
    private HBox msgPanel;
    @FXML
    private TextField textField;
    @FXML
    private Button btnSend;
    @FXML
    private TextArea textArea;
    @FXML
    private ListView ClientList;
    @FXML
    private HBox authPanel;
    @FXML
    private TextField loginField;
    @FXML
    private TextField passwordField;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Controller() {
        connection();
    }

    private void connection() {
        try {
            this.socket = new Socket("localhost", 8189);
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            setAuth(false);

            new Thread(() -> {
                try {
                    while (true) {
                       final String msgFromServer = in.readUTF();
                       if (msgFromServer.startsWith("/authok")) {
                           setAuth(true);
                           break;
                       }
                       textArea.appendText(msgFromServer + "\n");
                     }
                    while (true) {
                        final  String msgFromServer = in.readUTF();
                        if ("/end".equals(msgFromServer)) {
                            break;
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }

                }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void setAuth(boolean isAuthSuccess) {
        authPanel.setVisible(!isAuthSuccess);
        authPanel.setManaged(!isAuthSuccess);

        msgPanel.setVisible(isAuthSuccess);
        msgPanel.setManaged(isAuthSuccess);

        clientPanel.setVisible(isAuthSuccess);
        clientPanel.setManaged(isAuthSuccess);

    }



    public void sendAuth(ActionEvent actionEvent) {
        try {
            out.writeUTF("/auth" + loginField.getText() + " " + passwordField.getText());
            loginField.clear();
            passwordField.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg(ActionEvent actionEvent) {
        try {
            out.writeUTF(textField.getText());
            textField.clear();
            textField.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
