/*
 * Ultimate Tic-Tac-Toe by Tang
 * 2018.12.25
 * */

package edu.bjtu.tictactoe.client_side.dao;

import java.io.*;
import java.net.Socket;

public class PlayerNet {
    private static PlayerNet playerNet;
    private static Socket socket;
    private static BufferedReader in;
    private static PrintWriter out;

    public PlayerNet(){
        try {
            socket=new Socket("127.0.0.1",5618);
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PlayerNet getPlayerNet(){
        if(playerNet==null){
            playerNet=new PlayerNet();
        }
        return playerNet;
    }

    public BufferedReader getIn(){
        return in;
    }

    public PrintWriter getOut(){
        return out;
    }
}
