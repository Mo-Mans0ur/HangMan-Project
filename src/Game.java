

import java.util.ArrayList;

public class Game extends FileReader{
    static ArrayList<Character> attempts = new ArrayList<Character>();
    private String word;
    private int wrongGuesses = 0;



 public Game(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }



    public void userInput() {

     String status = "______";

     while (wrongGuesses != 6) {
            System.out.println();

            System.out.println("please input a letter below, \nremember to think twice: ");

            String guess = HangManMain.scanner.nextLine();
            attempts.add(guess.charAt(0));

            if (word.contains(guess) ) {

                int indexOfCorrectLetter = word.indexOf(guess);
                StringBuilder strBuilder = new StringBuilder(status);

                strBuilder.setCharAt(indexOfCorrectLetter,guess.charAt(0));

                status = strBuilder.toString();
                System.out.println(status);

                System.out.println("great he gets to live another day");

            }

        }
    }

    public static void convertWordsToLines(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (attempts.contains(word));
            System.out.print(word.replaceAll(word,("_")));
        }
        System.out.println();
    }








}
