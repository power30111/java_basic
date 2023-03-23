package Threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("Alice"),new CallableTask("Katolin"),new CallableTask("ranga"));


        List<Future<String>> futureList = executorService.invokeAll(tasks);     //invokeAll()은 모든 task가 실행을 완료하도록 대기한 후 결과를 얻어서 변수에 넣어주도록 하는 역할을 한다.
        for(Future<String> future:futureList){
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
