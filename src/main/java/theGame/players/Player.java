package theGame.players;

import theGame.Board;
import theGame.gameFlow.WinnerCheck;

public abstract class Player {
    private String name;
    private String symbol;
    private Board board;
    private WinnerCheck winnerCheck = new WinnerCheck();

    Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }


    public String getName() {
        return name;
    }

    private String getSymbol() {
        return symbol;
    }

    public void placePawn(Board board, int vertical) {
        int i = 0;
        if (vertical < 1 || vertical > 7) {
            throw new IllegalArgumentException("pick again," + vertical + " is not a column");
        }
        while (!board.getTheBoard()[i][vertical - 1].contains("[ ]")) {  //let the symbols drop
            i++;
        }
        board.getTheBoard()[i][vertical - 1] = this.getSymbol();
        winnerCheck.checkIfVictorious(board, i, (vertical - 1), this.getName(), this.getSymbol());

    }


}


