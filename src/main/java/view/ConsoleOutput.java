/**
 * Output.java
 * 화면에 글자를 출력하는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package view;

import domain.Car;

import java.util.List;

public class ConsoleOutput {
    private static final String PROGRESS_BAR = "-";
    private static final String TEXT_SPLITTER = ", ";

    public static void printError(String error) {
        System.out.println(error);
    }

    public static void printGameResultTitle() {
        System.out.println("실행 결과");
    }

    public static void printRacingCarProgress(Car car) {
        System.out.println(car.getName() + " : " + printProgressBar(car));
    }

    private static String printProgressBar(Car car) {
        String bar = "";

        for (int i = 0; i < car.getPosition(); i++) {
            bar += PROGRESS_BAR;
        }
        return bar;
    }

    public static void printOneNewLine() {
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println(String.join(TEXT_SPLITTER, winners)+"님이 최종 우승했습니다.");
    }


}
