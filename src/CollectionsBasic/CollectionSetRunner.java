package CollectionsBasic;

import java.util.*;

public class CollectionSetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','A','B','Z','F');
        //이 list에서 중복된원소를 제거하고 원소를 정렬되게 얻고싶으면 어떻게해야할까? Set을 써야겟지(중복제거를위해)
        //TreeSet, HashSet, LinkedHashSet을 알고있는데 이중 무엇을 써야할까? 중복제거와 정렬이 필요한건 TreeSet 적합하겟지.
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet = " + treeSet);
        //중복된 원소를 제거하면서 삽입 순서대로 원소를 얻고싶으면?
        Set<Character> LinkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("LinkedHashSet = " + LinkedHashSet);
        //순서는 상관없고 중복된 원소만 제거하고싶으면?
        Set<Character> HashSet = new HashSet<>(characters);
        System.out.println("HashSet = " + HashSet);
    }
}
