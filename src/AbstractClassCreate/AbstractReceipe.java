package AbstractClassCreate;

public abstract class AbstractReceipe{

    public void execute(){
        //excute() 메서드는 각각 getReady(),doTheDish(),cleanup()메서드를 실행하는데,
        //이 메서드들은 추상화된 메서드라서 아는게없다. 그러므로 이 클래스를 상속받고있는 Recipe1에 가서
        //메서드들의 정의를 확인한다.
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();

}
