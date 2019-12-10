package domain;

import java.util.Random;

public class Car {
    private final String name;
    private int position = 0;
    private static final int LUCKY_NUMBER = 4;

    public Car(String name) {
        this.name = name;
    }

    // 이 위로 손대지 말 것

    public void playTurn() {
        Random random = new Random();
        if (random.nextInt(10) >= LUCKY_NUMBER) {
            proceed();
        }
    }

    private void proceed() {
        position++;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
