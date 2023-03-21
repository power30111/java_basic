package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

    static<X> X doubleValue(X value){
        //<X>타입일 경우에는 허용한다 라는 규칙을 세우고 X와 같은 데이터타입인 value를 받아서 value를 리턴한다.
        return value;
    }
    static<X extends List> void duplicate(X list){
        //<X는 List를 상속받는 것이면 허용한다>라는 규칙을 세우고(제네릭) 정적메서드 duplicate를 만들었다.
        //즉 ArrayList, LinkedList,Vector 등등 의 인터페이스면 가능하다 이것의 장점은 list클래스에 존재하는 모든 메서드들을 적용가능하다는점이다.
        list.addAll(list);
    }
    static double sumOfNumberList(List<? extends Number> numbers){
        //여기서 ?가 와일드카드이다. 숫자클래스를 상속받는 아무 종류의 리스트는 매개변수로써 허용한다는 뜻이다.
        //여기서 사용된 와일드카드는 상한 경계 와일드카드라고한다.
        double sum = 0.0;
        for(Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }
    static void addACoupleOfValues(List<? super Number> numbers){
        //하한 경계 와일드카드는 super로 상한 경계 와일드카드는 extends로 연장하나봐..
        //숫자클래스의 하위클래스인 이상 아무종류나 이 특정한 numbers에 추가될 수 있다.
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1L);
    }

    public static void main(String[] args) {
        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println("emptyList = " + emptyList);

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5)));
        System.out.println(sumOfNumberList(List.of(1L,2L,3L,4L,5L)));


        String A = doubleValue(new String());
        Integer B = doubleValue(Integer.valueOf(5));
        ArrayList C = doubleValue(new ArrayList<>());
        ArrayList<Integer> numberList = new ArrayList<>(List.of(1,2,3));
        duplicate(numberList);
        System.out.println("numberList = " + numberList);

        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(5L);
        list.addElement(7L);
        Long value = list.get(0);
        System.out.println("list = " + list);
        System.out.println("value = " + value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);
        System.out.println("list2 = " + list2);
        System.out.println("number = " + number);
    }

}
