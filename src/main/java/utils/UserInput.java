/**
 * UserInput.java
 * 사용자의 입력을 받는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package utils;

import domain.Car;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_NAME_LENGTH = 5;

    public static List<Car> inputCars() {
        ConsoleOutput.printCarNameInputGuide();
        String[] carNames = SCANNER.nextLine().trim().replace(" ", "").split(",");
        List<Car> racingCars = new ArrayList<>();
        for (String carName : carNames) {
            verifyCarName(carName);
            racingCars.add(new Car(carName));
        }
        return racingCars;
    }

    private static void verifyCarName(String name) {
        if (name.length() == 0 || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public static int inputTurnCount() {
        ConsoleOutput.printInputTurnCountGuide();
        int turnCount = SCANNER.nextInt();
        verifyTurnCountIsNatural(turnCount);
        return turnCount;
    }

    private static void verifyTurnCountIsNatural(int turnCount) {
        if (turnCount < 1) {
            throw new InputMismatchException();
        }
    }
}
