package Threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("Alice"),new CallableTask("Katolin"),new CallableTask("ranga"));


        String result= executorService.invokeAny(tasks);     //하나의 Thread가 실행완료될때까지만 기다리고 결과를 변수에 넣는다.
        System.out.println("result = " + result);
        executorService.shutdown();
    }
}
