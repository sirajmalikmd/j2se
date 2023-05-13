package deck.of.cards;

import deck.of.cards.Card;

import java.util.ArrayList;

public class Deck <T extends Card>{

    private ArrayList<T> cards;// all cards, dealt or not
    private int dealtlndex = 0; // marks first undealt card
    //public void setDeckOfCards(ArrayList<T> deckOfCards) { ... }
   // public void shuffle() { ... }
    public int remainingCards() {
        return cards.size() - dealtlndex;
    }
   //  public T[] dealHand(int number) { ... }
   // public T dealCard() { ... }


}
