import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
public class Player implements Runnable{
    private final int id;
    private final List<List<Integer>> hands;
    private final List<List<Integer>> decks;
    
    public Player(int id, List<List<Integer>> hands, List<List<Integer>> decks){
        this.id = id;
        this.hands = hands;
        this.decks = decks;
    }

    @Override
    public void run() 
    {
        CardGame.takeTurn(id, hands, decks);
    }
}
