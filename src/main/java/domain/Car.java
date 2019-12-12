/**
 * Car.java
 * 자동차 객체의 클래스
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package domain;

import java.util.Random;

public class Car {

    private final String name;
    private int position = 0;


    public Car(String name) {
        this.name = name;
    }

    // 이 위로 손대지 말 것

    public void proceed() {
        position++;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

}
