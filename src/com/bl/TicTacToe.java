package com.bl;

import java.util.Arrays;

public class TicTacToe {

    private char[] board;
    private char playerLetter;
    private char computerLetter;

    public TicTacToe(){
        board = new char[10];
        Arrays.fill(board, ' ');
    }

    public static void main(String[] args) {
    }
}
