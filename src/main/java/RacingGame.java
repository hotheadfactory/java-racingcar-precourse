import domain.Car;
import utils.UserInput;

import java.util.List;

public class RacingGame {
    private final List<Car> racingCars;
    private final int turnCount;

    public RacingGame(List<Car> racingCars, int turnCount) {
        this.racingCars = racingCars;
        this.turnCount = turnCount;
    }

    public void start() {
        System.out.println("시이작!");
    }
}
