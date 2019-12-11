package utils;

import java.util.Random;

public class RandomGenerator {
    private static final int LUCKY_NUMBER = 4;

    public static boolean decideProceedOrNot() {
        Random random = new Random();
        return random.nextInt(10) >= LUCKY_NUMBER;
    }
}
