package theGame.players;

import java.util.Scanner;

public class InitializePlayers {

    public Player assignPlayer1Name(){
        System.out.println("please enter a name for player1");
        Scanner scanForPlayersName = new Scanner(System.in);
        String nameOfPlayer1 = scanForPlayersName.nextLine();
        return new Player1(nameOfPlayer1);
    }
    public Player assignPlayer2Name(){
        Scanner scanForPlayersName = new Scanner(System.in);
        System.out.println("please enter a name for player2");
        String nameOfPlayer2 = scanForPlayersName.nextLine();
        return new Player2(nameOfPlayer2);
    }
}
