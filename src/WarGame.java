import java.util.ArrayList;

public class WarGame {
    private Player player1, player2;


    public WarGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void initializeGame() {
        Deck startDeck = new Deck(true);
        startDeck.shuffle();

        ArrayList<Player> playersList = new ArrayList<Player>();                            // not sure
        if (this.player1.toString().compareToIgnoreCase(this.player2.toString()) <= 0) {
            playersList.add(this.player1);
            playersList.add(this.player2);      // sorts players names alphabetically
        } else {
            playersList.add(this.player2);
            playersList.add(this.player1);
        }

        while (!startDeck.isEmpty()) {                                      // **not sure
            playersList.get(0).addCardToGameDeck(startDeck.removeTopCard());
            if (!startDeck.isEmpty())
                playersList.get(1).addCardToGameDeck(startDeck.removeTopCard());
        }

    }

    /*
    public String start() {

        Card cardPlayer1 = this.player1.drawCard(), cardPlayer2 = this.player2.drawCard();

        while (!player1.getGameDeck().isEmpty() && !player2.getGameDeck().isEmpty()) {
            switch (cardPlayer1.compare(cardPlayer2)) {
                case 1:
                    player1.addCardToPrizeDeck(cardPlayer1);
                    player1.addCardToPrizeDeck(cardPlayer2);
                    break;
                case -1:
                    player2.addCardToPrizeDeck(cardPlayer1);
                    player2.addCardToPrizeDeck(cardPlayer2);
                    break;
                case 0:

                    break;

            }
        }

    }
    */


    /*
    private String warGameMode(Deck warDeck){
        if (player1.getGameDeck().isEmpty())
            return player2.toString();
        else if (player2.getGameDeck().isEmpty())
            return player1.toString();


    }
    */
}




