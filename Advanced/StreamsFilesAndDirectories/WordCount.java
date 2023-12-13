package Advanced.StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String folderPath = "D:\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(folderPath);
        long size = 0;
        for (File file : folder.listFiles()) {
            size += file.length();
        }
        System.out.println("Folder size: " + size);
    }
}
