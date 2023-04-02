package com.example.homework5;

public class CalculatonMars {

    public static final double calculationOfMarsuel = 100/(9.80665/3.72); // расчитывем переменную расход топлива на 1кг веса до Марс


    public static double calculation(double weight) {
        return weight * calculationOfMarsuel;
    }
}
