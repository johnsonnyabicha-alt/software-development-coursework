import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Player {
  private final List<Thread> threads = new ArrayList<>();
  
  @Test 
  void initialWinningHandStopsWithoutDrawing() throws InterruptedException {

    List<List<Integer>> hands = List.of(cards()

    Thread player = startPlayer(1, hands, decks);
    assertFinished(player);
    
    assertEquals(List.of(1, 1, 1, 1), hands.get(0));
    assertEquals(List.of(5, 6, 2, 3), decks.get(0));
    assertFalse(CardGame.isRunning());
  }
