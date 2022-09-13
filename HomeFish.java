package Laba1;

import Laba1.Animals;

public class HomeFish extends Animals {
    static int countFish;
    public HomeFish(String name, int maxSwim) {
        super(name, 0, maxSwim);
        countFish++;
    }
}
