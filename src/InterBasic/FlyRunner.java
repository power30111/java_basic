package InterBasic;

import java.util.ArrayList;

public class FlyRunner {
    public static void main(String[] args) {
        Flyable[] flyables = {new Bird(),new Aeroplane()};
        for(Flyable flyable:flyables){
            flyable.fly();
        }
    }
}
