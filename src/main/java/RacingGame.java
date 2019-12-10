/**
 * RacingGame.java
 * 게임의 본 로직이 실행되는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
import domain.Car;
import utils.Output;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> racingCars;
    private final int turnCount;

    private int highScore = 0;
    private List<String> winners = new ArrayList<>();

    public RacingGame(List<Car> racingCars, int turnCount) {
        this.racingCars = racingCars;
        this.turnCount = turnCount;
    }

    public void playGame() {
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

    public void displayResult() {
        getHighScore();
        for (Car oneCar : racingCars) {
            checkWinner(oneCar);
        }
        Output.printWinners(winners);
    }

    public void getHighScore() {
        for (Car oneCar : racingCars) {
            checkHighScore(oneCar);
        }
    }

    public void checkHighScore(Car car) {
        int position = car.getPosition();
        if (position > highScore) {
            highScore = position;
        }
    }

    private void checkWinner(Car car) {
        if (car.getPosition() == highScore) {
            winners.add(car.getName());
        }
    }

}
