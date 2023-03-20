package InterBasic;

public class Project {
    interface Test{
        void nothing();
        default void nothing2(){

        }
    }
    class Class implements Test{

        @Override
        public void nothing() {

        }
    }
    class Class2 implements Test{

        @Override
        public void nothing() {

        }
    }
    public static void main(String[] args) {
        //ComplexAlgorithm algorithm = new DummyAlgorithm();    //단지 구현체가 뭔지 선언을 바꿔준것만으로
        ComplexAlgorithm algorithm = new RealAlgorithm();       //동작하는게 변했다!
        System.out.println(algorithm.complexAlgorithm(10,20));
    }
}
