package Threading;
//extends Thread
//implements Runnable

class Task1 extends Thread{
    public void run(){  //signature 이괄호안에 어떤작업을 할것인지 정확하게 적어줘야한다.
                        //메서드 이름을 run이라고 하면 일반적인 메서드처럼 동작한다. start()여야만 한다
        //Task 1
        System.out.println("\n Task1 Started");
        for(int i =101; i<199; i++)
            System.out.println(i+" ");

        System.out.println("\n Task1 Done");
    }
}
class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\n Task2 Started");
        for(int i =201; i<299; i++)
            System.out.println(i+" ");

        System.out.println("\n Task2 Done");
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        //Task1                         추상클래스인 Thread를 상속받아 쓰레드를 구현하는법
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        //Task2                         인터페이스인 Runnable를 상속받아 쓰레드를 구현하는법 Runnable인터페이스를 구현해준다음.
        Task2 task2 = new Task2();      // Thread객체 생성을 위해서 Runnable인터페이스를 구현한 객체를 넣어준다.
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();                    //여기서도 start()로 실행해야 멀티쓰레딩이되는듯.

        //wait for task1 complete   //throws InterruptedException 를 해줘야한다.
        task1.join();       //task1 Thread가 끝날떄까지 Task3는 시작되지않는다.
        task2Thread.join();     //task2 Thread가 끝날떄까지 Task3는 시작되지않는다.
        //Task3
        for(int i =301; i<399; i++)
            System.out.println(i+" ");

        System.out.println("\n Task3 Done");
        System.out.println("\n Main Done");

    }
}
