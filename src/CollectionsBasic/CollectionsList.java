package CollectionsBasic;

import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        List<String> words = List.of("Aplle","Bat","Cat");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Dog"));
        System.out.println(words.indexOf("Cat"));
    }

}
