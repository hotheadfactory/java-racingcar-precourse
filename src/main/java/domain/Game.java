/**
 * Game.java
 * 자동차 경주 게임
 * 우아한테크코스 프리코스 2주차.
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.1, 2019.12.05 (c) 정회형
 */
package domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private User user = new User();
    private List<Car> cars = new ArrayList<Car>();

    public void startGame() {
        enrollPlayers(user.getCarNames());
        startRace(user.getTurnNumber());
        printWinner(getWinner());
    }

    private void enrollPlayers(String[] carArray) {
        for (String oneCar : carArray) {
            cars.add(new Car(oneCar));
        }
    }

    private void startRace(int turnNumber) {
        System.out.println("실행 결과");
        for (int i = 0; i < turnNumber; i++) {
            playOneTurn();
            System.out.println();
        }
    }

    private void playOneTurn() {
        for (Car oneCar : cars) {
            oneCar.playTurn();
            printPosition(oneCar);
        }
    }

    private void printPosition(Car oneCar) {
        System.out.println(oneCar.getName() + " : " + getBar(oneCar));
    }

    private String getBar(Car oneCar) {
        String bar = "";
        for (int i = 0; i < oneCar.getPosition(); i++) {
            bar += "-";
        }
        return bar;
    }

    private List<String> getWinner() {
        List<String> winnerList = new ArrayList<String>();
        int maxScore = getMaxScore();
        for (Car oneCar : cars) {
            if (oneCar.getPosition() == maxScore) {
                winnerList.add(oneCar.getName());
            }
        }
        return winnerList;
    }

    private int getMaxScore() {
        int maxScore = 0;
        for (Car oneCar : cars) {
            int thisCarPosition = oneCar.getPosition();
            if (thisCarPosition > maxScore) {
                maxScore = thisCarPosition;
            }
        }
        return maxScore;
    }

    private void printWinner(List<String> winnerList) {
        for (int i = 0; i < winnerList.size(); i++) {
            System.out.printf("%s", winnerList.get(i));
            if (i != winnerList.size() - 1) {
                System.out.printf(", ");
            }
        }
        System.out.printf("님이 최종 우승했습니다.\n");
    }
}
