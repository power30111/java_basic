package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {

        Path pathFileToRead = Paths.get("C:\\Users\\user\\Desktop\\Java_\\java_basic\\src\\files\\resources\\data.txt");
//        List<String> lines = Files.readAllLines(pathFileToRead);
//        System.out.println("lines = " + lines);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
