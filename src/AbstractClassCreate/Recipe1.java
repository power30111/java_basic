package AbstractClassCreate;

public class Recipe1 extends AbstractReceipe{
    //@Override 를 통해 getReady(),doTheDish(),cleanup() 메서드들을 다시
    //재 정의하였다.
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
        System.out.println("Prepare the dish");
    }

    @Override
    void cleanup() {
        System.out.println("clean up utensils");
    }
}
