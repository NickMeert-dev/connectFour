package theGame.gameFlow;

import theGame.Board;
import theGame.players.InitializePlayers;
import theGame.players.Player;
import theGame.players.Player1;
import theGame.players.Player2;

import java.util.Scanner;

public class Game {
    private Player1 player1=null;
    private Player2 player2=null;


    public void playTheGame() {

        Board game = new Board();

        Player player1 = new InitializePlayers().assignPlayer1Name();
        Player player2 = new InitializePlayers().assignPlayer2Name();
        System.out.println(player1.getName() + " VS " + player2.getName());

        int i = 0;
        game.printOutTheBoard(game.getTheBoard());
        while (i < 100) {
            System.out.println(player1.getName() + " please choose a column");
            Scanner column = new Scanner(System.in);
            player1.placePawn(game, Integer.parseInt(column.nextLine()));
            game.printOutTheBoard(game.getTheBoard());
            System.out.println(player2.getName() + " please choose a column");
            player2.placePawn(game, Integer.parseInt(column.nextLine()));
            game.printOutTheBoard(game.getTheBoard());
            i++;
        }

    }

    public Player1 getPlayer1() {
        return player1;
    }

    public Player2 getPlayer2() {
        return player2;
    }
}
