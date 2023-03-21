package CollectionsBasic;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,34,12,99));
        System.out.println(numbers.floor(40));      //floor => 인자보다 작거나 같은 숫자를 반환
        System.out.println(numbers.lower(34));      //lower => 인자보다 작은 숫자를 반환(미만)
        System.out.println(numbers.ceiling(34));    //ceiling => 인자보다 크거나 같은 숫자를 반환
        System.out.println(numbers.higher(34));     //higher => 인자보다 큰 숫자를 반환(초과)
        System.out.println(numbers.subSet(20,80));     //subSet => x이상이면서 y미만인 숫자를 반환
        System.out.println(numbers.subSet(34,true,65,true)); //이런식으로 미만과 초과기준을 변경가능
        System.out.println(numbers.headSet(50)); //인자까지의 모든숫자를 반환
        System.out.println(numbers.tailSet(50)); //50이후의 모든숫자를 반환

    }

}
