package theGame.gameFlow;

import theGame.Board;

public class WinnerCheck {
    public void checkIfVictorious(Board board, int horizontal, int vertical, String name, String symbol) {
        checkIfVictoriousVertical(board, horizontal, (vertical), name, symbol);
        checkIfVictoriousHorizontal(board, horizontal, (vertical), name, symbol);
        checkIfVictoriousDiagonalLeftBottomToRightUp(board, horizontal, (vertical), name, symbol);
        checkIfVictoriousDiagonalTopLefBottomRight(board, horizontal, (vertical), name, symbol);
    }

    private void checkIfVictoriousHorizontal(Board board, int vertical, int horizontal, String name, String symbol) {
        int pointCounter = 0;
        int i = 1;

        while ((horizontal - i) > -1 && horizontal < 7 && board.getTheBoard()[vertical][horizontal - i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }
        i = 1;
        while ((horizontal + i) < 7 && board.getTheBoard()[vertical][horizontal + i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }
        if (pointCounter >= 3) {
            asciiArt();
            System.out.println(name);
        }

    }

    private void checkIfVictoriousVertical(Board board, int vertical, int horizontal, String name, String symbol) {
        int pointCounter = 0;
        int i = 1;
        while ((vertical - i) > -1 && board.getTheBoard()[vertical - i][horizontal].contains(symbol)) {
            i++;
            pointCounter += 1;
        }

        if (pointCounter >= 3) {
            asciiArt();
            System.out.println(name);
        }

    }

    private void checkIfVictoriousDiagonalLeftBottomToRightUp(Board board, int vertical, int horizontal, String name, String symbol) {
        int pointCounter = 0;
        int i = 1;
        while ((horizontal + i) < 7 && (vertical + 1) < 7 && board.getTheBoard()[horizontal + i][vertical + i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }

        i = 1;
        while ((vertical - i) > -1 && (horizontal - i) > -1 && board.getTheBoard()[horizontal - i][vertical - i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }
        if (pointCounter >= 3) {
            asciiArt();
            System.out.println(name);
        }

    }

    private void checkIfVictoriousDiagonalTopLefBottomRight(Board board, int vertical, int horizontal, String name, String symbol) {
        int pointCounter = 0;
        int i = 1;
        while ((horizontal - i) > -1 && (vertical + i) < 7 && board.getTheBoard()[horizontal - i][vertical + i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }

        i = 1;
        while ((horizontal + i) < 7 && (vertical - i) > -1 && board.getTheBoard()[horizontal + i][vertical - i].contains(symbol)) {
            i++;
            pointCounter += 1;
        }
        if (pointCounter >= 3) {
            asciiArt();
            System.out.println(name);
        }
    }

    private void asciiArt() {
        System.out.println(" _        _ ____   ___   __ _____ ___");
        System.out.println("| |     / /  _/ | / / | / / ____/ __ \\\\");
        System.out.println("| | /| / // //  |/ /  |/ / __/ / /_/ /");
        System.out.println("| |/ |/ // // /|  / /|  / /___/ _, _/");
        System.out.println("|__/|__/___/_/ |_/_/ |_/_____/_/ |_|");


    }
}
