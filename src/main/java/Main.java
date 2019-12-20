/**
 * Client.java
 * 게임 클라이언트를 시작하는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Origial code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */

import view.ConsoleOutput;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.playGame();
        racingGameController.displayResult();
    }
}
