package tips.equals;


import java.util.Objects;

class Client{
    private int id;
    public Client(int id) {
        this.id = id;
    }
    //equals
    //hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {             //Hashcode는 다음과 같은 조건을 만족해야한다.
        return Objects.hash(id);        //1.만약 두 객체가 같다면 (ID가 같다면) 이둘의  Hashcode가 일치해야한다
    }                                   //2.Hashcode는 id가 바뀌지않는이상 변하지 않아야한다.
                                        //equals()메서드를 사용해줄때에는 hashcode()메서드도 함께 사용되도록 해야한다.
}                                       //hashcode()메서드는 여러 요소들을 균일하게 나눠서 bucket들에 넣을거시다.

public class EqualsRunner {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(1);

        System.out.println(c1.equals(c2));
    }
}
