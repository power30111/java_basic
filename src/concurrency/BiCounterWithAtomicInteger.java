
package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();
    public int getI() {
        return i.get();
    }
    public void incrementI(){
        i.incrementAndGet();                //equals i++
    }

    public int getJ() {
        return j.get();
    }
    public void incrementJ(){
        j.incrementAndGet();
    }
}

