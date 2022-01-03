/*
 * Ultimate Tic-Tac-Toe by Tang
 * 2018.12.25
 * */

package edu.bjtu.tictactoe.server_side;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class TestServer {
    private static ArrayList<ServerThread> arrayList = new ArrayList<>();



    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean listening = true;

        try {
            serverSocket = new ServerSocket(5618);
        } catch (IOException e) {
            System.exit(-1);
        }

        try {
            System.out.println(InetAddress.getLocalHost().toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        while (listening) {
            try {
                ServerThread serverThread = new ServerThread(serverSocket.accept());
                arrayList.add(serverThread);
                serverThread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static ArrayList getArrayList() {
        return arrayList;
    }

}
