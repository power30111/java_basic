package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");

        //Files.list(currentDirectory).forEach(System.out::println);

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        //path를 확인하고 path의 string값을 확인하여 ".java"를 포함하는지에 대해 검증하는 코드
//        Files.walk(currentDirectory,4)  //현재 디렉토리에 포함된 내용을 확인하고
//                .filter(predicate)                //predicate를 기준으로 걸러내는 filter
//                .forEach(System.out::println);    //그걸 출력하는 작업.

        //원하는 file를 찾아내는 코드는 또있다. Files.find()
        BiPredicate<Path, BasicFileAttributes> javaMatcher  //파일 이름에 따라 찾기
                = (path,attributes) -> String.valueOf(path).contains(".java");

        BiPredicate<Path, BasicFileAttributes> directoryMatcher
                = (path,attributes) -> attributes.isDirectory();//파일 속성에 따라 찾기

        Files.find(currentDirectory,4, directoryMatcher)
                .forEach(System.out::println);
    }
}
