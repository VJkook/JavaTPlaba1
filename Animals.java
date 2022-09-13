package Laba1;

import Laba1.Animal;

public class Animals implements Animal {
    String name;
    static int count;
    int maxRun;
    int maxSwim;

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    public void Run(int distance) {
        this.name = name;
        this.maxRun=maxRun;
//        if (maxRun>distance){
//            System.out.printf(name + " пробежал " + distance + " м!");}
//        else if (maxRun==0) { System.out.printf(name + " не умеет бегать!");}
//        else System.out.printf(name + " не смог пробежать " + distance + " м!");
    }

    public void Swim(int distance) {
        this.name = name;
        this.maxSwim=maxSwim;
    }

    @Override
    public String run(int distance) {
        if (maxRun>=distance){
            return name + " пробежал " + distance + " м!";}
        else if (maxRun==0) { return name + " не умеет бегать!";}
        else return name + " не смог пробежать " + distance + " м!";
    }

    @Override
    public String swim(int distance) {
        if (maxSwim>=distance){
            return  name + " проплыл " + distance + " м!";}
        else if (maxSwim==0) { return name + " не умеет плавать !";}
        else return name + " не смог проплыть " + distance + " м!";
    }
}