package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread{
    private int number;
    public Task(int number){
        this.number =number;
    }
    public void run(){
        System.out.println("\n Task "+number+" Started ");

        for(int i =number*100; i<=number*100+99; i++){
            System.out.println(i + " ");
        }
        System.out.println("\n Task "+number+" Done ");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();  //가장 기본이 되는 버전으로써 한번에 하나의 Thread를 실행하도록 하는 기능을 제공한다.
        //###ExecutorService에서 newSingleThreadExecutor()를 통해 새로 생성해주게 될경우 한번에 하나의 Thread만 동작하게된다.(단, ExecutorService에서 관리하는 쓰레드만이 관리받는다.)
        ExecutorService executorService = Executors.newFixedThreadPool(2);  //-> 고정된 갯수의 멀티 쓰레드를 관리할수있게 만든다.
        executorService.execute(new Task(1));                               //  다시말해 어떤 시점에서도 동시에 동작할수있는 Thread의 갯수를 미리 정해놓는다.
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        executorService.shutdown();                             //executorService.shutdown()은 필수적으로 적어줘야한다, 그렇지않으면 프로그램이 계속 동작하게된다.

    }
}
