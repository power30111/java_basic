package concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
        String str = "ABCD ABCD ABCD";
        for (char character : str.toCharArray()){
            occurances.computeIfAbsent(character,ch -> new LongAdder()).increment();    //character 라는 key에 값이 존재하지않는다면 LongAdder를 호출
        }
        System.out.println(str.toCharArray()[1]);
        System.out.println(occurances);
    }
}
