package tips;

public class NestedClassRunner {

    int i;
    class InnerClass{
        public void method(){
            i =5;                           //Inner Class는 이런식으로 NestedClassRunner안에서 선언된 변수들에 접근가능하다
        }
    }
    static class StaticNestedClass{         //static Class는 정적인 것에 해당한다
        public void method(){               //static class 내부에서 직접적으로 생성하는것이 가능하다.
//            i =5;                         //단, StaticNestedClass안에서 선언된 member변수에 접근하는것은 불가능하다
        }
    }

    public static void main(String[] args) {
//        InnerClass innerClass =new InnerClass();
        StaticNestedClass staticNestedClass = new StaticNestedClass();//static class는 인스턴스가 없어도 객체선언가능

        NestedClassRunner nestedClassRunner = new NestedClassRunner();
        InnerClass innerClass = nestedClassRunner.new InnerClass();     //일반 Inner Class는 인스턴스가없을경우 이런식으로 가능하다


    }
}
