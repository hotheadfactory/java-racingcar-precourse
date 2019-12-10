package utils;

import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.Output;

public class UserInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static List<Car> inputCars() {
        Output.printCarNameInputGuide();
        String[] carNames = SCANNER.nextLine().trim().replace(" ", "").split(",");
        List<Car> racingCars = new ArrayList<>();
        for(String carName : carNames) {
            racingCars.add(new Car(carName));
        }
        return racingCars;
    }

    public static int inputTurnCount() {
        Output.printInputTurnCountGuide();
        return SCANNER.nextInt();
    }
}
