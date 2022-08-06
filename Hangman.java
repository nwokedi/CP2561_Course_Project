import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Random random = new Random();
        String word;
        int wrongGuessCounter = 0;
        Scanner sc = new Scanner("\"C:\\Users\\Kedi\\Desktop\\contacts.txt");
        List<String> words = new ArrayList<>();

        while (sc.hasNext()) {
            words.add(sc.nextLine());
        }
        word = words.get(random.nextInt(words.size()));
        System.out.println("Please enter word: ");

        List<Character> Guesses = new ArrayList<>();

    }
}
