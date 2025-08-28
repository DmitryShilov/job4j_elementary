package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double substractionDivision(double first, double second) {
        return  substraction(first, second)
                + division(first, second);
    }

    public static double sumMultiplySubstractionDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + substraction(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат рассчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат рассчета равен: " + substractionDivision(15, 30));
        System.out.println("Результат рассчета равен: " + sumMultiplySubstractionDivision (20, 40));
    }
}
