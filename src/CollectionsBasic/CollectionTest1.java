package CollectionsBasic;

import java.util.HashMap;
import java.util.TreeMap;

public class CollectionTest1 {
    public static void main(String[] args) {
        //"This is a great thing" 이 주어졌을떄,각 문자가 문자열에서 몇번 나오는지?
        //이 문자열에서 각 단어가 몇번이나 존재하는지?
        String s = new String("this is a great thing").replace(" ","");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i =0; i<s.length();i++){
            String a= String.valueOf(s.charAt(i));
            if(treeMap.containsKey(a) == true){
                treeMap.put(a,treeMap.get(a)+1);
            }
            else{
                treeMap.put(a,1);
            }
        }
        String[] d = new String("this is a great thing").split(" ");
        for(String c:d){
            if(hashMap.containsKey(c) == true){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else{
                hashMap.put(c,1);
            }
        }
        System.out.println(treeMap);
        System.out.println(hashMap);
    }
}
