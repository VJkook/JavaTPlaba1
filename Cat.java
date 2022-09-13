package Laba1;

import Laba1.Animals;

public class Cat extends Animals {
    static int countCat;
    public Cat(String name) {
        super(name, 200, 0);
        countCat++;
    }
}
