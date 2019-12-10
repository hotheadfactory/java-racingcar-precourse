/**
 * RacingGame.java
 * 입력값을 검증하는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package utils;

import domain.Car;

import java.util.InputMismatchException;
import java.util.List;

public class Verify {
    private static final int MAX_NAME_LENGTH = 5;

    public static void verifyRacingCarName(List<Car> racingCars) {
        for (Car oneCar : racingCars) {
            String name = oneCar.getName();
            if (name.length() == 0 || name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void verifyTurnCountIsNatural(int turnCount) {
        if (turnCount < 1) {
            throw new InputMismatchException();
        }
    }
}
