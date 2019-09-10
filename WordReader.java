package lab4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordReader {

    public static Word[] loadWords() {
        Word[] wordArray = new Word[10000];

        try {
            String currentDirectory = System.getProperty("user.dir") + "/";
            // System.out.println(currentDirectory);
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(currentDirectory + "words.csv"), "UTF-8"));
            int count = 0;
            while (count < wordArray.length) {
                wordArray[count] = parseWord(bf.readLine());
                count++;
            }
            bf.close();
        } catch (IOException e) {
            System.out.println("File 'words.csv' not found.");
        }

        return wordArray;
    }

    private static Word parseWord(String line) {
        if (line == null)
            return null;

        String[] strPair = line.split(",");
        if (strPair.length == 2)
            return new Word(strPair[0], Integer.parseInt(strPair[1]));
        else
            return null;
    }

}
