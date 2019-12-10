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
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static List<Car> inputCars() {
        Output.printCarNameInputGuide();
        String[] carNames = SCANNER.nextLine().trim().replace(" ", "").split(",");
        List<Car> racingCars = new ArrayList<>();
        for (String carName : carNames) {
            racingCars.add(new Car(carName));
        }
        Verify.verifyRacingCarName(racingCars);
        return racingCars;
    }

    public static int inputTurnCount() {
        Output.printInputTurnCountGuide();
        int turnCount = SCANNER.nextInt();
        Verify.verifyTurnCountIsNatural(turnCount);
        return turnCount;
    }
}
