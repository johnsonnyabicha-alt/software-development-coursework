public class Card{
    private final denomination;
    public Card(int denomination){
        if (denomination <  0){
            throw new IllegalArgumentException;
        }
        this.denomination = denomination;
    }
    public int getDenomination() {
        return denomination;
    }
}
