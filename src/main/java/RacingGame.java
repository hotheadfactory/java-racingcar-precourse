/**
 * RacingGame.java
 * 게임의 본 로직이 실행되는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */

import domain.Car;
import utils.ConsoleOutput;
import utils.RandomGenerator;
import utils.UserInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class RacingGame {
    private static final int MAX_NAME_LENGTH = 5;

    private final List<Car> racingCars = new ArrayList<>();
    private final int turnCount;

    public RacingGame() {
        ConsoleOutput.printCarNameInputGuide();
        UserInput.inputCarsName().stream()
                .forEach(x -> addCar(x));
        ConsoleOutput.printInputTurnCountGuide();
        this.turnCount = UserInput.inputTurnCount();
        verifyTurnCountIsNatural();
    }

    private void addCar(String carName) {
        verifyCarName(carName);
        racingCars.add(new Car(carName));
    }

    private void verifyCarName(String name) {
        if (name.length() == 0 || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void verifyTurnCountIsNatural() {
        if (this.turnCount < 1) {
            throw new InputMismatchException();
        }
    }

    public void playGame() {
        ConsoleOutput.printGameResultTitle();
        for (int i = 0; i < turnCount; i++) {
            playOneTurn();
            ConsoleOutput.printOneNewLine();
        }
    }

    private void playOneTurn() {
        for (Car oneCar : racingCars) {
            playEachTurn(oneCar);
            ConsoleOutput.printRacingCarProgress(oneCar);
        }
    }

    public void playEachTurn(Car oneCar) {
        if (RandomGenerator.decideProceedOrNot()) {
            oneCar.proceed();
        }
    }

    public void displayResult() {
        int highScore = findHighScore();
        List<String> winners = new ArrayList<>();
        for (Car oneCar : racingCars) {
            checkWinner(oneCar, highScore, winners);
        }
        ConsoleOutput.printWinners(winners);
    }

    public int findHighScore() {
        int highScore = 0;
        for (Car oneCar : racingCars) {
            highScore = checkHighScore(oneCar, highScore);
        }
        return highScore;
    }

    public int checkHighScore(Car car, int highScore) {
        int position = car.getPosition();
        if (position > highScore) {
            return position;
        }
        return highScore;
    }

    private void checkWinner(Car car, int highScore, List<String> winners) {
        if (car.isMaxPosition(highScore)) {
            winners.add(car.getName());
        }
    }

}
