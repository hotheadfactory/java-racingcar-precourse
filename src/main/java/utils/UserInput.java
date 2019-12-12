/**
 * UserInput.java
 * 사용자의 입력을 받는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static final Scanner SCANNER = new Scanner(System.in);


    public static List<String> inputCarsName() {
        List<String> carNames = Arrays.asList(SCANNER.nextLine().trim().replace(" ", "").split(","));
        return carNames;
    }

    public static int inputTurnCount() {
        int turnCount = SCANNER.nextInt();
        return turnCount;
    }
}
