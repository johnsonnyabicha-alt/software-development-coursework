import java.util.ArrayList;
import java.util.List;
public class Player
{
    List<Card> hand = new ArrayList<>();

    public void addCard(Card card)
    {
        hand.add(card);
    }

}
