package com.bl;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private char[] board;
    private char playerLetter;
    private char computerLetter;
    private boolean isPlayerTurn;

    public TicTacToe() {
        board = new char[10];
        Arrays.fill(board, ' ');
    }

    public void chooseLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a Letter (X or O): ");
        String letter = sc.nextLine();
        while (!letter.equals("X") && !letter.equals("O")) {
            System.out.println("Invalid Input");
            letter = sc.nextLine();
        }

        playerLetter = letter.charAt(0);
        if (playerLetter == 'X') {
            computerLetter = 'O';
        } else {
            computerLetter = 'X';
        }
        System.out.println("You Choose: " + playerLetter + " Computer Gets: " + computerLetter);
    }

    public void printBoard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9] + " ");
    }

    public void makeMove(int index, char letter) {
        board[index] = letter;
    }

    public boolean isSpaceFree(int index) {
        return board[index] == ' ';
    }

    public void setCell(int index, char symbol) {
        board[index] = symbol;
    }

    public boolean isBoardFull() {
        for (int i = 1; i < board.length; i++) {
            if (isSpaceFree(i)) {
                return false;
            }
        }
        return true;
    }

    public void letterPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position To Move (1-9): ");
        int index = sc.nextInt();

        while (index < 1 || index > 9 || !isSpaceFree(index)) {
            System.out.println("Invalid position or position already occupied. Please choose a valid position (1-9): ");
            index = sc.nextInt();
        }

        makeMove(index, playerLetter);
        isPlayerTurn = false;
    }


    public void firstToss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            System.out.println("Heads! You play first.");
            isPlayerTurn = true;
        } else {
            System.out.println("Tails! Computer plays first.");
            isPlayerTurn = false;
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.chooseLetter();
        game.firstToss();
        game.printBoard();
    }
}
