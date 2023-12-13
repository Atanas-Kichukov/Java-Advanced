package Advanced.StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static int row = 1;

    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("D:\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        List<String> lines = Files.readAllLines(pathFile);
        PrintWriter writer = new PrintWriter("outputLines.txt");

//        for (String line : lines){
//            writer.println(row++ + ". " + line);
//
//        }
//        writer.close();


        lines.forEach(line -> writer.println(row++ + ". " + line));
        writer.close();
    }
}
