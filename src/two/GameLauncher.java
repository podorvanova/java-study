package two;

import java.security.Guard;

public class GameLauncher {
    public static void main(String[] args) {
        // Создаем объект GuessGame
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
