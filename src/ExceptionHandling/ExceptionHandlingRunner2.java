package ExceptionHandling;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 End");
    }

    private static void method2() {
        try{
            //String str = null;
            //str.length();                   //어떠한 예외가 발생하더라도 catch문으로 넘어간다.
            int[] i ={1,2};
            int number = i[3];
            System.out.println("Method2 End");  //catch문으로 넘어갔기떄문에 이 부분은 실행되지않는다.

        }catch(NullPointerException ex) {
            System.out.println("Matched NullPointerException");
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException ex){
            //ArrayIndexOutOfBoundsException 뿐만아니라 이것의 상위클래스인 IndexOutOfBoundsException, RuntimeException, Exception 또한 같은 예외를 처리해줄수있다.
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Matched Exception");
            ex.printStackTrace();     //이 부분이 없다면 Method1 End, Main End가 출력된다.
        }
    }
}

