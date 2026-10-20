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
    @Test 
    void winningHandMustContainExactlyFourCards() {
        assertFalse(CardGame.winCheck(List.of(7, 7, 7)));
        assertFalse(CardGame.winCheck(List.of(7, 7, 7, 7, 7)));
    }
    @Test 
    void distributesCardsInRoundRobinOrder() {
        List<Integer> pack = List.of( f
                0, 1, 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15);

        List<List<Integer>> hands = new ArrayList<>();
        List<List<Integer>> decks = new ArrayList<>();

        CardGame.distribute(pack, 2, hands, decks);

        assertEquals(List.of(0, 2, 4, 6), hands.get(0));
        assertEquals(List.of(1, 3, 5, 7), hands.get(1));
        assertEquals(List.of(8, 10, 12, 14), decks.get(0));
        assertEquals(List.of(9, 11, 13, 15), decks.get(1));
    }
}

