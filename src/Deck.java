import java.util.ArrayList;
import java.util.List;

public class Deck {
    private ArrayList<Card> listDeck;

    public Deck(Boolean start) {
        listDeck = new ArrayList<Card>();
        if (start) {
            for (Shape iShape : Shape.values()) {
                for (int j = 1; j <= 13; j++) {
                    listDeck.add(new Card(j, iShape));
                }
            }
        }

    }

    public void addCard(Card  card){
        listDeck.add(card);
    }

    public Card removeTopCard(){
        return listDeck.remove(listDeck.size()-1);
    }

    public boolean isEmpty(){
        return listDeck.isEmpty();
    }

    public void shuffle(){
        int index1,index2;
        Card pointer;
        for(int i=0; i<50; i++){
            index1 = Main.rnd.nextInt(this.listDeck.size());
            index2 = Main.rnd.nextInt(this.listDeck.size());

            pointer = this.listDeck.get(index1);
            this.listDeck.set(index1,this.listDeck.get(index2));
            this.listDeck.set(index2,pointer);
        }
    }
}
