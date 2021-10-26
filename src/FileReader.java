
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileReader {
    static Random random = new Random();
    static ArrayList<String> listOfWords = new ArrayList<String>();


    public static void getWords() {
        try {
            Scanner scanner = new Scanner(new File("Ressources/randomWords.csv"));
            while (scanner.hasNextLine()) {
                listOfWords.add(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("File couldn't be found");
            e.printStackTrace();
        }

    }

    public static String getRandomWord() {
        String word = listOfWords.get(random.nextInt(listOfWords.size()));
        System.out.println(word);   //<--Remove later
        return word;
    }


}

