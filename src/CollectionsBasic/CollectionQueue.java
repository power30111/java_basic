package CollectionsBasic;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(),value2.length());
        //1번쨰 인자와 2번째 인자를 비교하여 1번쨰가 더 클경우 1 아닐경우 -1 같을경우 0
    }
}
public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.poll();               //요소를 꺼낼때 쓰는 메서드 비어있을경우 null
        queue.offer("Apple");              //요소를 추가할떄 쓰는 메서드
        queue.addAll(List.of("Zebra","Monkey","Cat"));      //여러 요소들을 추가할때 쓰는 메서드
        System.out.println("queue = " + queue);
        System.out.println(queue.poll());                   //Apple 이 반환된다. -> 가장 먼저 넣은게 나옴

        //만일 문자열의 길이를 기준으로 뽑아내고 싶다면 어떻게해야할까?(짧은 길이의 단어부터 출력)
        //Comparator<>인터페이스를 상속받아서 재정의한다.
        Queue<String> queue2 = new PriorityQueue<>(new StringLengthComparator());
        queue2.addAll((List.of("Zebra","Monkey","Cat","Dog")));
        System.out.println("queue2 = " + queue2);
    }


}
