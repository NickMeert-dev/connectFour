package com.switchfully.fodfin.connectFour;

import com.switchfully.fodfin.connectFour.players.Player;

import java.util.Arrays;

public class Board {
    private int yAxis = 6;
    private String[][] theBoard;

    private Player player;

    public Board() {
        this.theBoard = createEmptyBoard();
    }

    public String[][] getTheBoard() {
        return theBoard;
    }

    private String[][] createEmptyBoard() {

        int xAxis = 7;
        String[][] squaredArray = new String[xAxis][yAxis + 1];
        createAllRowsThatCanBeSelectedForPlacement(squaredArray);
        createTopRowWithNumbers(squaredArray);
        return theBoard = squaredArray;

    }

    public void printOutTheBoard(String[][] squaredArray) {
        System.out.println("\n");
        for (int i = yAxis; i > -1; i--) {
            System.out.println(Arrays.toString(squaredArray[i]));
        }
    }

    private void createAllRowsThatCanBeSelectedForPlacement(String[][] squaredArray) {
        for (int i = 0; i < yAxis + 1; i++) {
            squaredArray[i] = new String[]{"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
        }
    }

    private void createTopRowWithNumbers(String[][] squaredArray) {
        squaredArray[6] = new String[]{" 1", "  2", "  3", "  4", "  5", "  6", "  7 "};
    }

}
