package Advanced.StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("D:\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        // String path = D:\04. Java-Advanced-Streams-Files-and-Directories-Resources\04. Java-Advanced-Files-and-Streams-Exercises-Resources
        List<String> lines = Files.readAllLines(pathFile);
        lines.stream().map(String::toCharArray).forEach(charArray -> {
            int sum = 0;
            for (char symbol : charArray) {
                sum += symbol;
            }
            System.out.println(sum);
        });
    }
}
