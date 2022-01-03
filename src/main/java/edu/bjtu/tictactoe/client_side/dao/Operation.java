/*
 * Ultimate Tic-Tac-Toe by Tang
 * 2018.12.25
 * */

package edu.bjtu.tictactoe.client_side.dao;

public interface Operation {
    String paint(String code);
    void setSymbol(String code);
    void rule();
}
