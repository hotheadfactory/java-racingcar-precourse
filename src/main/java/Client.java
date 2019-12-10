
import utils.Output;

import java.util.InputMismatchException;

import static utils.UserInput.inputCars;
import static utils.UserInput.inputTurnCount;

public class Client {
    public static void main (String[] args) {
        try {
            RacingGame racingGame = new RacingGame(inputCars(), inputTurnCount());
            racingGame.start();
        } catch (IllegalArgumentException e) {
            Output.printWrongName();
        } catch (InputMismatchException e) {
            Output.printNumberOnly();
        }
    }
}
