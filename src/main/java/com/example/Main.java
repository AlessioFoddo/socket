package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3000);
        System.out.println("Server avviato!");

        do{
        Socket s = server.accept();
        System.out.println("Un client si è collegato!");

            MioThread t = new MioThread(s);
            t.start();
        }while(true);
    }

}