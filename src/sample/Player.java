package sample;

public class Player {

    private int gamesWon; // keeps track of total games player has won
    private int playerNum; // determines if player is player 1 or 2
    private char character; // determines if player is using X or O

    public void Player(int gamesWon,int playerNum, char character){
        this.gamesWon = gamesWon;
        this.playerNum = playerNum;
        this.character = character;
    }
}
