package Functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer number) {
        return number%2 ==0;
    }
}
class SystemOutConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
class NumberSquareMapper implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
public class LambdaRunner {
    public static void main(String[] args) {
        List.of(23,43,34,45,36,48).stream()
                .filter(e -> e%2==0)
                .map(n -> n*n)
                .forEach(e -> System.out.println(e));           //이 쪽과 아래 Predicate를 구현한것과 같은 동작을 한다..

        List.of(23,43,34,45,36,48).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());              //forEach는 Consumer라는 인터페이스를 기반으로 하고있다.
        //Stream<T> filter(Predicate<? super T> predicate);
        //boolean test(T t);

        //Consumer <? super T> action -> forEach()는 Consumer를 기반으로 하고있다.
        //void accept(T t); //consumer는 어떠한 것도 반환하지 않는다. (Consumer -=> 소비자)
        //Consumer는 void accpet()라는 메서드를 가지고있다.. 위

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper); map은 Funtion 인터페이스에 기반을 두고있는데
        //R apply(T t);                                               Funtion은 R apply라는 메서드를 가지고있다.
        //람다식을 사용하기 위해서 함수형 인터페이스를 실행하기위한 생성이 일어나고있고, 그 실행에 대한 결과도 만들어진다.
    }
}
