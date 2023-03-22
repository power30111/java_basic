package Functional;

import java.util.List;

public class MethodReferencesRunner {
    public static void print(Integer A){
        System.out.println(A);
    }
    public static void main(String[] args) {
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)    //사용하고자 하는 String클래스를 넣어주고, 사용하고자 하는 메서드 length를 넣어준다.
                .forEach(System.out::println);  //System.out 이라는 클래스를 지정해주고. 사용하고자 하는 메서드를 뒤에 넣어준다.

        //ex) 예시로 위에 정적 메서드 print를 정의해주었다.
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)
                .forEach(MethodReferencesRunner::print);

        List.of(23,45,67,34).stream()
                .filter(n -> n % 2==0)
                .max(Integer::compare)
                .orElse(0);
    }
}
