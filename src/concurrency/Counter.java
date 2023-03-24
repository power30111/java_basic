package concurrency;

public class Counter {
    int i=0;

    public int getI() {
        return i;
    }
    synchronized public void increment(){
        i++;
        //i++은 3가지 연산을 수행하는데,
        //i 값을 얻고 , increment를 해준뒤,i값을 설정해주는 것
    }
}
