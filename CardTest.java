import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

enum Suit {DIAMOND, CLUB, HEART, SPADE;}
enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;}
public class Card {
    private Suit  suit;
    private Rank  rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {return suit;}
    public Rank getRank() {return rank;}
    public int getValue() {return rank.ordinal() + 1;}
    public String toString() {return suit + "-" + rank;}
}

class CardDeck {
    List<Card> deck;

    CardDeck() {
        deck = new ArrayList<>();
        for (Suit suit: Suit.values()) {
            for (Rank rank : Rank.values()) {

            }
        }
    }
    public void print(){
        System.out.println(deck);
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
}

public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.print();
        deck.shuffle();
        deck.print();
    }
}