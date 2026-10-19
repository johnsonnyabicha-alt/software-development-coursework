import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;
public class Player implements Runnable{
    private final id;
    player(int id){
        this.id = id;
    }

    @Override
    public void run() 
    {
        CardGame.takeTurn(id);
    }
}