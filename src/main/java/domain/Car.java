package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 이 위로 손대지 말 것

    private void proceed() {
        position++;
    }

    public String getName() {
        return this.name;
    }
}
