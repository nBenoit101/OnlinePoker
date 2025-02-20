package poker.game.finalp;

public class PokerGame
{
    public int bigBlind;
    public int littleBlind;
    public Deck deck;
    public int pot;

    public PokerGame(){
        littleBlind = 5;
        bigBlind = 10;
        deck = new Deck();
        pot = 0;
    }
}
