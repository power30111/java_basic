package Functional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 3, 2, 5, 8, 6, 7, 9, 10);
        squareNumber();
        List<String> Str = List.of("Apple", "Ant", "Bat");
        smallLetter(Str);
        lengthLetter(Str);
        System.out.println(A());
        System.out.println("MaxNumber = " + MaxNumber().get());
        System.out.println("MinNubmer = " + MinNumber().get());
        System.out.println(GetOddList());
        System.out.println(GetsquareNumberList());
    }

    private static void squareNumber() {//Int형 Stream을 생성후 제곱해서 출력하기
        IntStream.rangeClosed(1, 10)                 //2번쨰 인자까지 포함
                .forEach(e -> System.out.println(e * e));
    }

    private static void smallLetter(List<String> Str) { //문자열 리스트를 받은후 소문자로 변경하여 출력하기
        Str.stream()
                .map(e -> e.toLowerCase())
                .forEach(e -> System.out.println("e = " + e));
    }

    private static void lengthLetter(List<String> Str) {
        Str.stream()
                .map(e -> e.length())
                .forEach(e -> System.out.println("e = " + e));
    }

    private static int A() {
        return IntStream.range(1, 11)
                .reduce(0, (num1, num2) -> num1 + num2);
    }

    private static Optional<Integer> MaxNumber() {       //최대값구하기
        return List.of(23, 12, 34, 53).stream()
                .max((n1, n2) -> Integer.compare(n1, n2));
    }

    private static Optional<Integer> MinNumber() {       //최소값구하기
        return List.of(23, 12, 34, 53).stream()
                .min((n1, n2) -> Integer.compare(n1, n2));
    }

    private static List<Integer> GetOddList() {          //리스트에서 홀수만 뽑아내서 새로운 리스트 구하기.?
        return List.of(23, 12, 34, 53)
                .stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());
    }

    private static List<Integer> GetEvenList() {     //리스트에서 짝수만..
        return List.of(23, 12, 34, 53)
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }
    private static List<Integer> GetsquareNumberList(){
        return IntStream.rangeClosed(1,10)
                .map(e -> e*e)
                .boxed()
                .collect(Collectors.toList());
    }

}

