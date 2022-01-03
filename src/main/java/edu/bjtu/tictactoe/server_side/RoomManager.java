/*
 * Ultimate Tic-Tac-Toe by Tang
 * 2018.12.25
 * */

package edu.bjtu.tictactoe.server_side;

import java.util.ArrayList;

public class RoomManager {
    private static ArrayList<String[]> roomArrayList=new ArrayList<>();

    public static ArrayList getRoomArrayList(){
        return roomArrayList;
    }
}
