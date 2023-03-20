package CollectionsBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        List<String> wordList = List.of("apple","Bat","Cat");
        List<String> wordArrayList = new ArrayList<>(wordList);
        wordArrayList.add("Elephant");
        wordArrayList.add(2,"Ball");
        for (int i =0; i< wordArrayList.size(); i++){
            System.out.println(wordArrayList.get(i));
        }
        for(String word:wordArrayList){
            System.out.println(word);
        }
        Iterator wordsIterator = wordArrayList.iterator();
        while(wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }
    }
}
