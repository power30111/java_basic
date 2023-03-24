import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DADadDFweo {
    public static void main(String[] args) {
        String[] babbling = {"aya","yee","ye","wyeoo"};
        String a = "aya";
        int[] numbers = {1,2,3,4,5};
        String[] CanSay = new String[]{"aya", "ye", "woo", "ma"};
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[2];

        System.out.println(CanSay.length);
        //System.out.println(answer.length);
        //System.out.println(Arrays.stream(numbers).max().getAsInt());//Int[] 에서 최대값 int형으로받기

        List<Integer> integersList1 = IntStream.of(numbers)         //numbers를 IntStream이란 형태의 stream제공
                .boxed()                                            //boxed()는 primitive타입을 Wrapper 객체로 변경해준다.IntStream -> Stream<Integer>
                .collect(Collectors.toList());                      //Stream을 새로 list를 만들어준다.
//        int maxNum = IntStream.of(numbers)
//                .boxed()
//                .max((n1,n2)->Integer.compare(n1,n2))             //primitive 타입의 배열을 Wrapper 객체로 변경후 최대값을 int로 뽑아냄.
//                .get();

//        StringBuffer sb = new StringBuffer(my_string);            //Stringbuffer 객체 생성한뒤 StringBuffer에서 지원하는 reverse() 메서드를 사용하고
//        String answer = sb.reverse().toString();                    //toString()메서드를 통해 String으로 변환. 기본 String 문자열 뒤집기.

//        String answer = my_string.replaceAll(letter,"");           //문자열에서 원치않는 단어,문자를 모두 없애고싶어

//        int b = (5 < 4) ? 50 : 40;                            //삼항연산자. ()안 조건이 참이면 50 아니면 40

//        int[] array33333 = Arrays.copyOf(array,3)             //(원본배열,복사할 길이)
//        int[] array33333 = Arrays.copyOfRange(array,3,4)      //(원본배열,복사 시작인덱스,복사 종료인덱스)
    }


}
