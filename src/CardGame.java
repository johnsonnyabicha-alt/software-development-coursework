import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class CardGame {
    public static void main(String[] args) throws IOException{ 
        BufferedReader reader1 = new BufferedReader( new InputStreamReader(System.in)); // FileReader only accepts .txt files
        try{
            Integer numberOfPlayers = playerCheck(reader1);
            if (numberOfPlayers == null) {
                return;
            }
            List<Card> pack = packCheck(reader1, numberOfPlayers);
            if (pack == null){
                return;
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
                expectedPackSize(intInput);
                return intInput;
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid number of players. Please enter a positive integer with a valid range of 8n.");
            }
        }
    }
    static List<Card> packCheck(BufferedReader reader1, int n) throws IOException{
        while(true) {
            System.out.println("Please type the location of the pack file.")
            String line  == reader1.readline(); 
            if (line == null){
                return null;
            }
            try{
                if(line.trim().isEmpty()){
                    throw new IllegalArgumentException("A file path is required.");
                }
                return readPack(Path.of(line.trim()),n);
            } catch (IOException | IllegalArgumentException e){
                System.out.println("Invalid pack:" e.getMessage());
            }
        }
    } 
    public static List<Card> readPack(Path path, int intInput) throws IOException{
        int expected = expectedPackSize(intInput);
        List<Card> pack = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            int row = 0; 
            while((line = reader.readLine()) != null){
                row++;
                if(row > expected){
                    throw new IllegalArgumentException("Expected" + expected + ". Found more rows than expected. For example, if there are 2 players, the number of rows should be 8n.")
                }
                String value = line.trim();
                if(!value.matches("[0-9]+")){
                    throw new IllegalArgumentException("Row value must be a positive integer ");
                } 
                try{
                    pack.add(new Card(Integer.parseInt(value))); /* if the value doesn't satisfy this if check-where the string must be a positive integer from 0-9, 
                                                                that repeats as many times as possible. e.g "12345" wont throw an exception */ 
                } catch (NumberFormatException e ){
                    throw new IllegalArgumentException("Row" + row + "exceeds the java int range.");
                }
            }
        }
        if (pack.size() != expected){
            throw new IllegalArgumentException("Number of rows should be" + expected + "but the number of rows received were" + pack.size());
        }
        return List.copyOf(pack) // unmodified list -> we cannot add, delete, move any elements in the pack for the rest of the game.
    }
    private static int expectedPackSize(int n){
        if (n <= 0 || n > Integer.MAX_VALUE/ 8){ // prevents integer overflow and makes sure n > 0.
            throw new IllegalArgumentException("The pack provided is not valid.");
        }
        return 8 * n;
    }

    public static void distribute(pack, n, List<List<Card>> hands, List<List<Card>> decks)
    {
        for (i = 0; i < n; i+=1;)
        {
            hands.add(new ArrayList<>());
            decks.add(new ArrayList<>());

        }

        while (i=0; i < 4*n; i++;) {
            hands.get(i % n).add(pack(i));
        }
        while (i = 4n; i < 8*n; i++;) {
            decks.get(i%n).add(pack(i));
        }
    }

    public static void play(List<Card> pack, int n, hands, decks)
    {
        List<Thread> threads = new ArrayList<>();
    }
}