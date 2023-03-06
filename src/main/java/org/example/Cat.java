package org.example;

public class Cat extends Creature {

    public Cat(int maxDistance, int maxHeight, String name, boolean inGame) {
        super(maxDistance, maxHeight, name, inGame);
    }

    @Override
    public void celebrate() {
        System.out.println("Мур! " + super.getName() + " победил! Мяу!");
    }
}
