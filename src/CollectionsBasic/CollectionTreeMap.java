package CollectionsBasic;

import java.util.TreeMap;

public class CollectionTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("F",25);
        treeMap.put("Z",5);
        treeMap.put("L",250);
        treeMap.put("A",15);
        treeMap.put("B",25);
        treeMap.put("G",25);
        System.out.println("treeMap = " + treeMap);
        System.out.println(treeMap.higherKey("B"));             //higherKey() => 인자보다 더 높은 값을 반환.("B"보다 큰값)
        System.out.println(treeMap.higherKey("C"));
        System.out.println(treeMap.ceilingKey("B"));            //ceilingKey() => "B"와 같거나 큰값을 반환
        System.out.println(treeMap.lowerKey("B"));              //lowerKey() => "B"보다 작은 키값 반환
        System.out.println(treeMap.floorKey("B"));              //floorKey() => "B" 보다 작거나 같은 키값 반환
        System.out.println(treeMap.firstEntry());               //첫번쨰 입력값 반환
        System.out.println(treeMap.lastEntry());                //마지막 입력값 반환
        System.out.println(treeMap.subMap("C","Y"));            //subMap() => C~Y사이의 key,value 값 반환
        System.out.println(treeMap.subMap("C",true,"Y",true));

    }


}
