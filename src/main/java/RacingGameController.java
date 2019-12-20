/**
 * RacingGame.java
 * 게임의 본 로직이 실행되는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */

import domain.Car;
import view.ConsoleOutput;
import domain.RandomGenerator;
import view.UserInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class RacingGameController {
    private static final int LUCKY_NUMBER = 4;

    private final List<Car> racingCars = new ArrayList<>();
    private final int turnCount;

    public RacingGameController() {
        UserInput.inputCarsName().stream()
                .forEach(x -> addCar(x));
        this.turnCount = UserInput.inputInt();
    }

    private void addCar(String carName) {
        racingCars.add(new Car(carName));
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
        if (RandomGenerator.generateRandomNumber() >= LUCKY_NUMBER) {
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
