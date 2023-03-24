package ExceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner =null;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {1, 2, 3, 4};
            int number = numbers[2];
            System.out.println("Before Scanner Close");

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if(scanner!=null) { //혹여나 Scanner 객체를 생성하는 과정에서 예외가 발생할수도있으므로 객체가 존재할경우에만 실행하도록 함.
                System.out.println("scanner closed");
                scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
