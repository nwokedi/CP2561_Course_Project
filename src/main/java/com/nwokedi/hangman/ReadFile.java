package com.nwokedi.hangman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadFile {
    static ArrayList<String> wordList = new ArrayList<>();


    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/main/resources/words.txt");
        Scanner inputDevice = new Scanner(fileReader);

        // words from the text file to the array list
        while(inputDevice.hasNextLine()) {
            wordList.add(inputDevice.nextLine());
        }

    }
    public  String getRandomWord(){
        Random random = new Random();
        if(wordList.isEmpty()) return "Empty";
        return wordList.get(random.nextInt(wordList.size()));
    }
}
