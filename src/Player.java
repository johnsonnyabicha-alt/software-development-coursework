import java.util.ArrayList;
public class Player
{
    List<Card> hand = new ArrayList<>();

    public void addCard(Card card)
    {
        hand.add(card);
    }

}