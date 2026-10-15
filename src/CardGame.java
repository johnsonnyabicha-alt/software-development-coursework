import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class CardGame {
    private CardGame() { }
    public static void main(String[] args) throws IOException{ 
        BufferedReader reader1 = new BufferedReader( new InputStreamReader(System.in)); // FileReader only accepts .txt files
        try{
            Integer numberOfPlayers = playerCheck(reader1);
            if (numberOfPlayers == null){
                return;
            List<Card> pack = packCheck(reader1, numberOfPlayers);
            if (pack == null){
                return;
            }
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Please type an positive integer, for the number of players in the game.");
        }
        

        System.out.println("Please type the location of a valid input pack: ");
        String path = reader1.readLine();

        packCheck(reader1,path);
        playerCheck(reader1, players);
    }
    static Integer playerCheck(BufferedReader reader1) throws IOException{

        System.out.println("Please type the number of players in the game : ");
        String input = reader1.readLine();
        while(true){
            if (input == null){ // readline returns null, whenever no more input is available.
                return null; // note: pressing enter on a empty line returns " " not null
            }
            try{
                int intInput = Integer.parseInt(input.trim()); // trim removes any whitespaces.
                expectedCardSize(intInput);
                return intInput;
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid number of players. Please enter a positive integer with a valid range of 8n.");
            }
        }
    }
    static List<Card> packCheck(BufferedReader reader1, int n) throws IOException{
        while((loc = reader1.readLine()) != null) {
            try{

            }
        }
    } 
    public static List<Card> readPack(Path reader1, int intInput){
        int expected = expectedCardSize(intInput);
        List<Card> pack = new ArrayList<>();
    }
    public static void deal(){

    }
    private static int expectedCardSize(int n){
        if (n <= 0 || n > Integer.MAX_VALUE/ 8){ // prevents integer overflow and makes sure n > 0.
            throw new IllegalArgumentException("The pack provided is not valid.");
        }
        return 8 * n;
    }
}