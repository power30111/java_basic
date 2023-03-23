package Threading;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private String name;
    public CallableTask(String name){
        this.name =name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    } //특정 값을 반환하는 task의 경우에는 Callable 인터페이스를 실행해줘야한다.

}
public class CallableRunner {//어떠한 값을 반환하는 task를 만들고싶다.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> WelcomeFuture = executorService.submit(new CallableTask("Alice"));//execute()가 아닌 submit()메서드로 callable을 실행할수있따.
        System.out.println("WelcomeFuture execute = " + WelcomeFuture);

        String welcomMessage = WelcomeFuture.get();                             //WelcomFuture에 대해.get()메서드를 불러내면 task가 실행을 완료할때까지 기다리게된다.

        System.out.println("welcome Message = " + welcomMessage);

        System.out.println("\n Main completed");

        executorService.shutdown();
    }
}
