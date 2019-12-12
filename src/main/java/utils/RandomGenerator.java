/**
 * RandomGenetator.java
 * 자동차를 앞으로 던질까 말까 던질까 말까 던던던던
 * 우아한테크코스 프리코스 2주차 복습
 * Original code https://github.com/hotheadfactory/java-racingcar-precourse
 * Version: v0.0.2, 2019.12.11 (c) 정회형
 */
package utils;

import java.util.Random;

public class RandomGenerator {
    private static final int LUCKY_NUMBER = 4;

    public static boolean decideProceedOrNot() {
        Random random = new Random();
        return random.nextInt(10) >= LUCKY_NUMBER;
    }
}
