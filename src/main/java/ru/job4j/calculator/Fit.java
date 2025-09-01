package ru.job4j.calculator;

public class Fit {

    public static float manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static float womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        float man = Fit.manWeight(height);
        System.out.println("Man 180 cm is " + man + " kg");

        height = 170;
        float woman = Fit.womanWeight(height);
        System.out.println("Woman 170 cm is " + woman + " kg");
    }

}
