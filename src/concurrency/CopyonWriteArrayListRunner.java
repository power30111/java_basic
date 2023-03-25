package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayListRunner {
    public static void main(String[] args) {


        List<String> list = new CopyOnWriteArrayList<>();   //add 연산만을 동기화 해주는 역할.

        //Threads -3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        for(String str : list){
            System.out.println(str);
        }
    }
}
