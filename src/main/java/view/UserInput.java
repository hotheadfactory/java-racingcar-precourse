/**
 * UserInput.java
 * 사용자의 입력을 받는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package view;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static final int MAX_NAME_LENGTH = 5;
    private static final Scanner SCANNER = new Scanner(System.in);


    public static List<String> inputCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        try {
            List<String> carNames = Arrays.asList(SCANNER.nextLine().trim().replace(" ", "").split(","));
            carNames.forEach(x -> verifyCarName(x));
            return carNames;
        }catch (IllegalArgumentException e) {
            ConsoleOutput.printError("이름은 공백이 있거나 5자 이상일 수 없습니다!");
        }
        return inputCarsName();
    }

    public static int inputTurnCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            int turnCount =  SCANNER.nextInt();
            verifyTurnCountIsNatural(turnCount);
            return turnCount;
        } catch (InputMismatchException e) {
            ConsoleOutput.printError("음수나 숫자가 아닌 텍스트는 입력할 수 없습니다!");
            SCANNER.nextLine();
        }
        return inputTurnCount();
    }

    private static void verifyCarName(String name) {
        if (name.length() == 0 || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private static void verifyTurnCountIsNatural(int turnCount) {
        if (turnCount < 1) {
            throw new InputMismatchException();
        }
    }
}
