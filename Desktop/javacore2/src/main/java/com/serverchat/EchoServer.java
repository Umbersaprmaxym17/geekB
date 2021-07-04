package com.serverchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        // Try with Resources
        try (ServerSocket serverSocket = new ServerSocket(8181))  {
            System.out.println("Waiting for client to connect");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            while (true){
                String s = inputStream.readUTF();
                if ("/end".equals(s)) {
                    break;
                }
                outputStream.writeUTF(" Echo "  + s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
