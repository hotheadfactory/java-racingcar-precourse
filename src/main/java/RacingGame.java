import domain.Car;
import utils.Output;
import utils.UserInput;

import java.util.List;

public class RacingGame {
    private final List<Car> racingCars;
    private final int turnCount;

    public RacingGame(List<Car> racingCars, int turnCount) {
        verifyRacingCarName();
        verifyTurnCountIsNatural();
        this.racingCars = racingCars;
        this.turnCount = turnCount;
    }

    public void start() {
        Output.printGameResultTitle();
        for (int i = 0; i < turnCount; i++) {
            playOneTurn();
            Output.printOneNewLine();
        }
    }

    private void playOneTurn() {
        for (Car oneCar : racingCars) {
            oneCar.playTurn();
            Output.printRacingCarProgress(oneCar);
        }
    }

    private void verifyRacingCarName() {
        for(Car oneCar : racingCars) {
            String name = oneCar.getName();
            if(name.length() == 0 || name.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }

}
