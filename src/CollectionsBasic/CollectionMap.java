package CollectionsBasic;

import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
        System.out.println(map);                //당연하게도 .of 메서드를 통해 만든것은 모두 불변이다.
        System.out.println(map.get("Z"));       //get() key값을 입력하여 그에 맞는 value값을 반환한다. key가 존재하지않는다면 null
        System.out.println(map.size());         //size() map의 크기반환
        System.out.println(map.isEmpty());      //isEmpty map이 비어있는지 확인
        System.out.println(map.containsKey("A"));  //contatinsKey() 해당 Key가 있는지 확인후 반환.
        System.out.println(map.containsValue(3));   //contatinsValue() 해당 value값이 있는지 확인후 반환
        System.out.println(map.keySet());           //keySet() 해당 map의 모든 Key 반환
        System.out.println(map.values());           //vlaues() 해당 map의 모든 value 반환

        Map<String,Integer>hashmap = new HashMap<>(map);
        hashmap.put("F",5);                         //put Key는 "F"고 value는 5인 원소추가 해당 key가 없었다면 추가후 null반환. 이미 존재한다면 그 key에 해당하면 value를 변경.

        HashMap<String,Integer> hashMap2 = new HashMap<>();
        //삽입순서 보장x 정렬되지않는다.
        hashMap2.put("Z",5);
        hashMap2.put("A",15);
        hashMap2.put("F",25);
        hashMap2.put("L",250);
        System.out.println("hashMap2 = " + hashMap2);

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        //삽입 순서를 보장한다.
        linkedHashMap.put("F",25);
        linkedHashMap.put("A",15);
        linkedHashMap.put("Z",5);
        linkedHashMap.put("L",250);
        System.out.println("linkedHashMap = " + linkedHashMap);

        TreeMap<String,Integer> treeMap =new TreeMap<>();
        //key값 기준으로 정렬
        treeMap.put("F",25);
        treeMap.put("A",15);
        treeMap.put("Z",5);
        treeMap.put("L",250);
        System.out.println("treeMap = " + treeMap);
    }
}
