package com.bl;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private char[] board;
    private char playerLetter;
    private char computerLetter;

    public TicTacToe(){
        board = new char[10];
        Arrays.fill(board, ' ');
    }

    public void chooseLetter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a Letter (X or O): ");
        String letter = sc.nextLine();
        while (!letter.equals("X") && !letter.equals("O")){
            System.out.println("Invalid Input");
            letter = sc.nextLine();
        }

        playerLetter = letter.charAt(0);
        if (playerLetter == 'X'){
            computerLetter = 'O';
        }else {
            computerLetter = 'X';
        }
        System.out.println("You Choose: " + playerLetter + " Computer Get: " + computerLetter);
    }

    public void printBoard(){
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9] + " ");
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.chooseLetter();
        game.printBoard();
    }
}
