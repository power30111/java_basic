package CollectionsBasic;

import java.util.*;

public class CollectionHashSet {
    public static void main(String[] args) {
        //순서를 보장하지않는다.중복을 허용하지않는다
        Set<Integer> numbers = new HashSet<>();
        numbers.add(765432);
        numbers.add(76543);
        numbers.add(7654);
        numbers.add(765);
        System.out.println("numbers = " + numbers);

        Set<Integer> numbers2 = new LinkedHashSet<>();
        //삽입 순서는 보장한다.  중복을 허용하지않는다.
        numbers2.add(765432);
        numbers2.add(76543);
        numbers2.add(7654);
        numbers2.add(765);
        System.out.println("numbers2 = " + numbers2);

        Set<Integer> numbers3 = new TreeSet<>();
        //크기순서대로 정렬된 순서를 저장한다. 중복을 허용하지않는다.
        numbers3.add(765432);
        numbers3.add(76543);
        numbers3.add(7654);
        numbers3.add(765);
        System.out.println("numbers3 = " + numbers3);


    }

}
