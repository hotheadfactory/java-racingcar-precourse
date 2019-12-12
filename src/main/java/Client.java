/**
 * Client.java
 * 게임 클라이언트를 시작하는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Origial code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */

import utils.ConsoleOutput;

import java.util.InputMismatchException;

public class Client {
    public static void main(String[] args) {
        try {
            RacingGame racingGame = new RacingGame();
            racingGame.playGame();
            racingGame.displayResult();
        } catch (IllegalArgumentException e) {
            ConsoleOutput.printError("이름 란은 5글자를 넘기거나 비어있을 수 없습니다!");
        } catch (InputMismatchException e) {
            ConsoleOutput.printError("음수나 숫자가 아닌 텍스트는 입력할 수 없습니다!");
        }
    }
}
