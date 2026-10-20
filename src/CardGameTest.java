import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CardGameTest{
    @Test 
    void fourMatchingCardsWin() {
        List<Integer> hand = List.of(7, 7, 7, 7);

        assertTrue(CardGame.winCheck(hand));
    }
}

