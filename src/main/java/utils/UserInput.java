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
        String[] carNames = SCANNER.nextLine().split(",");
        List<Car> cars = new ArrayList<>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public static int inputTurnCount() {
        Output.printInputTurnCountGuide();
        return SCANNER.nextInt();
    }
}
