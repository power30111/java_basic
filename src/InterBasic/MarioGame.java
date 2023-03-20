package InterBasic;

public class MarioGame implements GamingConsole{


    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a hole");
    }

    @Override
    public void right() {
        System.out.println("go left side");
    }

    @Override
    public void left() {
        System.out.println("go right side");
    }
}
