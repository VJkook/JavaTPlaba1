package Laba1;

import Laba1.Animals;

public class Dog extends Animals {
    static int countDog;
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, 10);
        countDog++;
    }
}
