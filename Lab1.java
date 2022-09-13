package Laba1;

import Laba1.*;

class Lab1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya");
        Dog dog = new Dog("Kira", 100, 100);
        Dog dog1 = new Dog("Хаги",200, 10);
        Tiger tiger = new Tiger("V", 1000, 1000);
        HomeFish fish = new HomeFish("Nemo", 10000);
        HomeFish fish1 = new HomeFish("Nemo1", 10000);
        System.out.println("Всего животных = " + Animals.count);
        System.out.println("Всего собак = " + Dog.countDog);
        System.out.println("Всего котов = " + Cat.countCat);
        System.out.println("Всего рыбок = " + HomeFish.countFish);
        System.out.println("Всего тигров = " + Tiger.countTiger);
        Animal[] animals = {cat, dog, dog1, tiger, fish, fish1};
        for (Animal anim : animals) {
            System.out.println(anim.run(200));
            System.out.println(anim.swim(200));
        }


    }
}
