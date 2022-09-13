package Laba1;

import Laba1.Animals;

public class Tiger extends Animals {
    static int countTiger;
    public Tiger(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        countTiger++;
    }
}
