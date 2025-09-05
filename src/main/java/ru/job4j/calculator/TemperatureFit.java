package ru.job4j.calculator;

public class TemperatureFit {

    public static double idealTemperatureFourFruits(int temperature) {
        return temperature - 2.0;
    }

    public static double idealTemperatureFromMeat(int temperature) {
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int temperature = 10;
        double fruitsTemp = TemperatureFit.idealTemperatureFourFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureFromMeat(temperature);
        System.out.println("Ideal tempetrature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature from meat is " + meatTemp + "°C");
    }
}
