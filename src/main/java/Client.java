import static utils.UserInput.inputCars;
import static utils.UserInput.inputTurnCount;

public class Client {
    public static void main (String[] args) {
        RacingGame racingGame = new RacingGame(inputCars(), inputTurnCount());
        racingGame.start();
    }
}
