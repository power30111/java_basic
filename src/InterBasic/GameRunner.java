package InterBasic;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(),new ChessGame()};
        for (GamingConsole gamingConsole : games){
            gamingConsole.down();
            gamingConsole.up();
            gamingConsole.right();
            gamingConsole.left();
        }

        //MarioGame game = new MarioGame();
//        ChessGame game = new ChessGame();
//        game.down();
//        game.left();
//        game.up();
//        game.down();
    }
}