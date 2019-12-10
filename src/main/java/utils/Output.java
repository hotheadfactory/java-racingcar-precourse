package utils;

import domain.Car;

public class Output {
    private static final String BAR = "-";

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
        System.out.println("숫자만 입력할 수 있는 필드입니다!");
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
}
