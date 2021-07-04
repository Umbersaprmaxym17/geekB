package com.serverchat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    private  DataOutputStream outputStream;
    private  Socket socket;
    private  DataInputStream inputStream;
    private  Scanner scanner;
    private static String messageText;

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

            // to send data to the server
            final DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // to read data coming from the server
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // to read data from the keyboard
            final BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));


            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            final String messageFromServer = inputStream.readUTF();
                            System.out.println(messageFromServer);
                            String str, str1;
                            while (!(str = keyBoard.readLine()).equals("exit")) {

                                // send to the server
                                dataOutputStream.writeBytes(str + "\n");

                                // receive from the server
                                str1 = bufferedReader.readLine();

                                System.out.println(str1);
                            }
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

    private String sendMessage() {
        final  String s = scanner.nextLine();
        try {
            outputStream.writeUTF(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        messageText = s;
        return  messageText;
    }

    public static String getMessage() {
        return messageText;
    }
}
