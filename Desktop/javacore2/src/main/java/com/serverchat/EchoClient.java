package com.serverchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {

        new EchoClient();

    }

    public EchoClient() {
        openConnection();
    }

    private void openConnection() {
        try (Socket socket = new Socket("127.0.0.1", 8181);
             DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        ) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
