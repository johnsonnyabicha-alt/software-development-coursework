import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;

import java.util.ArrayList;
import java.util.List;

public class Player {
  
  @Test 
  void initialWinningHandStopsWithoutDrawing() throws InterruptedException {
    List<Integer> pack = List.of(7, 7, 7, 7, 1, 2, 3, 4);
    List<List<Integer>> hands = new ArrayList<>();
    List<List<Integer>> decks = new ArrayList<>();

    CardGame.distribute(pack,1,hands,decks);
    CardGame.play(pack, 1, hands, decks);
    
    assertFalse(CardGame.isRunning());
    assertEquals(List.of(7, 7, 7, 7), hands.get(0));
    assertEquals(List.of(1, 2, 3, 4), decks.get(0));
  }
  
  @Test
  void bothThreadsFinishAfterAWinner() throws InterruptExcepution {
    List<Integer> pack = List.of(1, 2, 1, 3, 1, 5, 4, 6, 1, 2, 0, 4, 7, 5, 8, 9);

    List<List<Integer>> hands = new ArrayList<>();
    List<List<Integer>> decks = new ArrayList<>();

    CardGame.distribute(pack, 2, hands, decks);
    CardGame.play(pack, 2, hands, decks);

    assertFalse(CardGame.isRunning());
    assertEquals(List.of(1, 1, 1, 1), hands.get(0));
    assertEquals(4, hands.get(0).size());
    assertEquals(4, hands.get(1).size());
      
  }
}
