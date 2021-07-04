package com.serverchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    private  DataOutputStream outputStream;
    private  Socket socket;
    private  DataInputStream inputStream;
    private  Scanner scanner;

    public static void main(String[] args) {
        new EchoClient();
    }

    public EchoClient() {
        scanner = new Scanner(System.in);
        openConnection();
        while (true) {
            sendMessage();
        }

    }

    private void openConnection() {
        try {
            socket = new Socket("localhost", 8181);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            final String messageFromServer = inputStream.readUTF();
                            System.out.println(messageFromServer);
                            }
                        } catch(IOException e){
                            e.printStackTrace();
                        } finally {
                            closeConnection();
                        }
                }
            }).start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void closeConnection() {
        try {
            outputStream.close();
            socket.close();
            inputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
       final String s = scanner.nextLine();
        try {
            outputStream.writeUTF(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
