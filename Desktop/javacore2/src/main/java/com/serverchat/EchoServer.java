package com.serverchat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer  {


    public static void main(String[] args) {

        // Try with Resources
        try (ServerSocket serverSocket = new ServerSocket(8181))  {
            System.out.println("Waiting for client to connect");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());


            // to send data to the client
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            // to read data coming from the client
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // to read data from the keyboard
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

            while (true){
                String str, str1;
                while ((str = bufferedReader.readLine()) != null) {
                    System.out.println(str);
                    str1 = kb.readLine();

                    // send to client
                    printStream.println(str1);
                }
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
