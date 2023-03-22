package Functional;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15,4,4,4);
//        numbers.stream()
//                .forEach(element -> System.out.println("element = " + element));
//        BasicSumNumber(numbers);
        //FPSumNumber(numbers);
        //FPSumOddNumber(numbers);
        //FPSortNumber(numbers);
        //FPNotDuplicateNumber(numbers);
        FPUsedMapMethod(numbers);
    }
    private static void BasicSumNumber(List<Integer> numbers){
        int sum=0;
        for(Integer num : numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
    private static void FPSumNumber(List<Integer> numbers){//숫자들의 합을 구하고싶어

        int sum = numbers.stream()
                .reduce(0, (number1,number2) -> number1 + number2); //0부터 시작해서 매 숫자 마다 더해서
        System.out.println("sum = " + sum);
    }
    private static void FPSumOddNumber(List<Integer> numbers){ //홀수 숫자들의 합을 구하고싶어   ㅅㅂ 이해를 못햇는데 문법만으로 동작이된다..
        int sum =  numbers.stream()
                .filter(num -> num%2!=0)                        //2로 나눳을떄 나머지가 0이 아닌애들만 넘기고
                .reduce(0,(num1,num2) -> num1+num2);     //그게 2개의 요소가 들어왔을때 num1+num2를 해서 ..
        System.out.println("OddSum = " + sum);
    }
    private static void FPSortNumber(List<Integer> numbers){
        numbers.stream()
                .sorted()
                .forEach(e-> System.out.println("e = " + e));
    }
    private static void FPNotDuplicateNumber(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(e-> System.out.println("e = " + e));
    }
    private static void FPUsedMapMethod(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .map(e-> e*e)
                .forEach(e -> System.out.println("e = " + e));
    }

}
