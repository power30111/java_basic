package tips.blocks;

public class BlockRunner {
    public static void main(String[] args) {
        {                               //이런 중괄호들을 하나의 block이라고 한다.
            System.out.println("3>2");
            int i;                      //여기 선언된 int i 는 이 block안에서만 사용가능하다.
        }
    }
}
