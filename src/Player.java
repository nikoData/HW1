public class Player {
    private String name;
    private Deck gameDeck,prizeDeck;

    public Player(String name){
        this.name = name;
        this.gameDeck =  new Deck(false);
        this.prizeDeck =  new Deck(false);
    }
    public Card drawCard(){//                    ****not finished
        return this.gameDeck.removeTopCard();
    }

    public boolean outOfCards(){                                        // not sure
        return this.gameDeck.isEmpty() && this.prizeDeck.isEmpty();
    }

    @Override
    public String toString(){
        return this.name;
    }


    public void addCardToGameDeck(Card card){
        this.gameDeck.addCard(card);
    }
    public void addCardToPrizeDeck(Card card){
        this.prizeDeck.addCard(card);
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public Deck getPrizeDeck() {
        return prizeDeck;
    }

    public String getName() {
        return name;
    }

    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrizeDeck(Deck prizeDeck) {
        this.prizeDeck = prizeDeck;
    }
}
