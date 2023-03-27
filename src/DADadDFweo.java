import java.math.BigDecimal;
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
        String str = new String();
        StringBuffer cha = new StringBuffer();
        BigDecimal decimal = new BigDecimal(100);
        String ab = "nice to meet you";
        ab=ab.replaceAll("n","");
        System.out.println("ab = " + ab);
        System.out.println(CanSay.length);
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        //테스트용 지워도됌dasdasdasdasdasd
        //System.out.println(answer.length);
        //대문자와 소문자간 ASCII 코드 차이는 32이다.
    //@@@@@@@@@@@@@@@@@@@@@@@@@ 자료형 및 연산자 등 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//        Integer.MIN_VALUE, Integer.MAX_VALUE                                                  //Integer의 최소,최대값.

//        StringBuffer sb = new StringBuffer(my_string);                                        //Stringbuffer 객체 생성한뒤 StringBuffer에서 지원하는 reverse() 메서드를 사용하고
//        String answer = sb.reverse().toString();                                              //toString()메서드를 통해 String으로 변환. 기본 String 문자열 뒤집기.

//        String answer = my_string.replaceAll(letter,"");                                      //문자열에서 원치않는 단어,문자를 모두 없애고싶어
//        String answer = my_string.toCharArray();                                              //python마냥 문자열을 char배열로 접근하고싶어
//        int b = (5 < 4) ? 50 : 40;                                                            //삼항연산자. ()안 조건이 참이면 50 아니면 40

//        int[] array33333 = Arrays.copyOf(array,3)                                             //(원본배열,복사할 길이)
//        int[] array33333 = Arrays.copyOfRange(array,3,4)                                      //(원본배열,복사 시작인덱스,복사 종료인덱스)

//         str = new StringBuilder(str).append(ch).append(ch).toString();                       //문자열을 StringBuilder형태로 변환후 append메서드로 추가해준뒤 toString()으로 문자열로 변환.

//        sb.append((c + "").repeat(n));                                                        //String Buffer쪽에 .repeat()이란 메서드가있네요.. 몇번 반복할지 해주는듯
//          return myString.replaceAll("a|e|i|o|u", "");                                        //String 문자열에 replaceAll;
//          answer = my_string.replaceAll("[aeiou]", "");                                       //String 문자열에 replaceAll;

//          char c = '1';
//          int n = Character.getNumericValue(c);                                               //char 문자로 (int)하니까 아스키코드가 출력된다..
//          System.out.println(n); // 결과: 1                                                    //해결하기위해선 -48 (숫자 1 = 아스키코드 49) 를 해주거나 getNumericValue();

//          String a = String.valueOf(n);   or Integer.toString();                              //int 형태 자료형 -> String
//          Integer.valueOf(string);
//
//        Character.isUpperCase()를 사용 대문자인지 구별
//        Character.isLowerCase()를 사용 소문자인지 구별
//        Character.isDigit()를 사용 숫자인지 구별

//          String.valueOf(boolean,double,float,int)등 String으로 해당객체 형변환
    //@@@@@@@@@@@@@@@@@@@@@@@@@@ stream          스트림 관련@@@@@@@@@@@@@@@@@@@@@@@
        //        Arrays.stream(s1).anyMatch(str::equals)                                       //s1문자열을 stream으로 anyMatch(만일 str와 같은것이 stream에 있다면 return True 아님 false

        //        (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();            //1부터  n까지의 숫자로부터 약수를 구할때 약수의 갯수를 구하는 것 stream에는 .count()도 있었다.

        //        int maxNum = IntStream.of(numbers)
//                .boxed()
//                .max((n1,n2)->Integer.compare(n1,n2))                                         //primitive 타입의 배열을 Wrapper 객체로 변경후 최대값을 int로 뽑아냄.
//                .get();

//                List<Integer> integersList1 = IntStream.of(numbers)                           //numbers를 IntStream이란 형태의 stream제공
//                .boxed()                                                                      //boxed()는 primitive타입을 Wrapper 객체로 변경해준다.IntStream -> Stream<Integer>
//                .collect(Collectors.toList());                                                //Stream을 새로 list를 만들어준다.

        //          System.out.println(Arrays.stream(numbers).max().getAsInt());                //Int[] 에서 최대값 int형으로받기

        //          int[] answer=IntStream.rangeClosed(1,n)
        //            .filter(num -> num%2 != 0)
        //            .toArray();                                                               //int Array 중 원하는값을 filter로 걸러내서 int Array로 반환.

        //        int[] c = Arrays.stream(a).mapToInt(i -> i).toArray();

        //        mapToInt(), mapToLong(), mapToDouble(), mapToObj();


    }
}
