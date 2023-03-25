package tips;


import java.util.Arrays;

enum Season{
    WINTER, SPRING, SUMMER, FALL;
    //0,1,2,3
}
enum SeasonVersion2{        //enum은 변수뿐만 아니라 생성자도 포함할수있다.
    SUMMER(1),WINTER(2),FALL(3),SPRING(4);
    private int value;

    private SeasonVersion2(int value){
        this.value=value;
    }

    public int getValue() { //getter를 통해 값을 가져오게끔하면된다.
        return value;
    }
}
public class enums {
    public static void main(String[] args) {
        String season = "";                     //계절에 Spring, Summer 등등을 붙일수도있지만 누군가는 Garbage라고 할수도있다.
                                                //계절에 넣을수있는 단어에 제한을 둘순없을까? -> Enum
        Season season1 = Season.WINTER;         //

        Season season2 = Season.valueOf("WINTER");
//        Season season3 = Season.valueOf("Winter");      //enum 에서 열거되지않은 단어는 허용되지않는다
        System.out.println(season2);
        System.out.println(season1.ordinal());            //enum에서 몇번째 순서에 있는 값인지 반환. ex) season1 -> WINTER이므로 0 return
        System.out.println(Arrays.toString(Season.values()));

        System.out.println(SeasonVersion2.SPRING.ordinal());
        System.out.println(SeasonVersion2.SPRING.getValue());       //마치. Map..
    }
}
