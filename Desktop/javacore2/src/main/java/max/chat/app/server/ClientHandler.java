package max.chat.app.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {

    private final Socket socket;
    private final ChatServer server;
    private final DataInputStream in;
    private final DataOutputStream out;

    private String name;

    public String getName() {
        return name;
    }

    public ClientHandler(Socket socket, ChatServer server) {
        try {
            this.name = " ";
            this.socket = socket;
            this.server = server;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    authenticate();
                    readMessages();
                } finally {
                    closeConnection();
                } 
            }).start();
        } catch (IOException e) {
            throw new RuntimeException(" Cannot create ClientHandler ", e);
        }

    }

    private void authenticate() {
        while (true) {
            try {
                final String str = in.readUTF();
                if (str.startsWith("/auth")) {
                    final String[] split = str.split(" \\s");
                    final String login = split[1];
                    final String password = split[2];
                    final String nickname = server.getAuthService()
                            .getNickNameBYLoginAndPassword(login,password);
                    if (nickname != null) {
                        if (!server.isNickNameBusy(nickname)) {
                            sendMessage("/authok" + nickname);
                            this.name = nickname;
                            server.broadcast("User "
                            + nickname +
                            "logged in into the Chat");
                            server.subscribe(this);

                        } else {
                            sendMessage("User logged in ");
                        }

                    } else {
                        sendMessage("Invalid Credentials ");
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

    }

    private void closeConnection() {
        try {
            server.unsubscribe(this);
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    public void sendMessage(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public void readMessages() {
        while (true) {
            try {
                final String strFromClient = in.readUTF();
                if ("/end".equals(strFromClient)) {
                    return;
                }
                System.out.println(" Message received from " + name + " :"
                + strFromClient);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException( e);
            }
        }
    }
}
