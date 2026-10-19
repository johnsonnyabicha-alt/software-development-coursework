import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
public class Player implements Runnable{
    private final id;
    private final List<List<Integer>> hands;
    private final List<List<Integer>> decks;
    
    public player(int id, List<List<Integer>> hands, List<List<Integer>> decks){
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
