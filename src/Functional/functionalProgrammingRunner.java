package Functional;

import java.util.List;

public class functionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Bat","Cat","Dog");
        //printBasic(list);
        //printWithFP(list);
        printBasicWithFiltering(list);
        printWithFPFiltering(list);
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        //printNumber(numbers);
        printOddNumber(numbers);
        printEvenNumber(numbers);
    }
    private static boolean decideOddNumber(Integer number){//함수형이니까 이렇게 만들어야하나 하고 만들어본 홀수판별함수
        if(number%2!=0){
            return true;
        }
        return false;
    }
    private static void printNumber(List<Integer> numbers){//list내부 요소(integer)을 출력하고싶어
        numbers.stream().forEach(   //numbers라는 Integer형의 List의 요소들로 흐름을 만들고 forEach()를 통해 모든요소 하나씩 접근한다.
                number -> System.out.println("element = " + number) //numbers의 요소는 number이고 이 number이 주어질때마다 -> 뒤에있는
        );                                                          //System.out.println()함수를 실행해라.
    }
    private static void printOddNumber(List<Integer> numbers){//List 중에서 홀수만 출력하고싶어!
        numbers.stream()                                      //numbers배열을 Stream으로 받아서
                .filter(number -> decideOddNumber(number))                //numbers의 요소 number를 2로 나눴을때 나머지가 0이 아니면 홀수니까 넘기자
                .forEach(number -> System.out.println("number = " + number));   //number를 받았으면 그 요소들을 println하자
    }
    private static void printEvenNumber(List<Integer> numbers){//List중에서 짝수만 출력하고싶어!
        numbers.stream()
                .filter(number -> number%2==0)
                .forEach(number -> System.out.println("number = " + number));
    }
    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }
    //printBasic과 printWithFP는 같은 결과를 낸다.
    private static void printWithFP(List<String> list) {
        list.stream().forEach(  // 람다식 코드의 의미는 각요소마다 실행해야할 함수를 보내는것이다.
                element -> System.out.println("element = "+element) //즉 함수를 매개변수로써 다른 함수에 통과시킨후 루프를 돌릴수있다.
        );
    }
    //문자열중에서 at으로 끝나는 문자열만 출력하고싶어.
    private static void printBasicWithFiltering(List<String> list){
        for(String str:list){
            if(str.endsWith("at")){
                System.out.println("str = "+str);
            }
        }
    }
    //printbasicWithFiltering과 같은 결과를 낸다..!
    private static void printWithFPFiltering(List<String> list){
        list.stream()                                       //list를 stream으로 받아서
                .filter(element -> element.endsWith("at"))  //filter를 적용시켜(요소들중에 at으로 끝나는 문자열만 통과)true일 경우에만 요소를 넘긴다.
                .forEach(element -> System.out.println("element = "+element)//여기서 element가 넘어오면 System.out.println()함수를 실행시켜
                );
    }

}
