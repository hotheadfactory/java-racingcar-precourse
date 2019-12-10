/**
 * Output.java
 * 화면에 글자를 출력하는 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package utils;

import domain.Car;

import java.util.List;

public class Output {
    private static final String BAR = "-";
    private static final String COMMA = ", ";

    public static void printCarNameInputGuide() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printInputTurnCountGuide() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static void printWrongName() {
        System.out.println("이름 란은 5글자를 넘기거나 비어있을 수 없습니다!");
    }

    public static void printNumberOnly() {
        System.out.println("음수나 숫자가 아닌 텍스트는 입력할 수 없습니다!");
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
            bar += BAR;
        }
        return bar;
    }

    public static void printOneNewLine() {
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        for (int i = 0; i < winners.size(); i++) {
            System.out.printf("%s", winners.get(i));
            putComma(winners, i);
        }
        System.out.printf("님이 최종 우승했습니다.\n");
    }

    private static void putComma(List<String> list, int i) {
        if (i != list.size() - 1) {
            System.out.printf(COMMA);
        }
    }


}
