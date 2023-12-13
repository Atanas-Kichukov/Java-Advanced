package Advanced.StreamsFilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathFile = "D:\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;
        String vowels = "aeiou";
        String punctuation = "?!.,";
        BufferedReader reader = new BufferedReader(new FileReader(pathFile));
        String line = reader.readLine();
        while (line!= null) {
            String[] words = line.split("\\s+");
            for(String word : words){
                for (char symbol : word.toCharArray()){
                    String charAsString = String.valueOf(symbol);
                    if(vowels.contains(charAsString)){
                        countVowels++;
                    }
                    else if(punctuation.contains(charAsString)){
                        countPunctuation++;
                    }
                    else{
                        countConsonants++;
                    }
                }
            }
            line = reader.readLine();
        }
            reader.close();
        PrintWriter writer = new PrintWriter("outputCount.txt");

        writer.println("vowels: " + countVowels);
        writer.println("Consonants: " + countConsonants);
        writer.println("Punctuation: " + countPunctuation);

        writer.close();
    }
}
