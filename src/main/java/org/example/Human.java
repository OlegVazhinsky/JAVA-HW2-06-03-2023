package org.example;

public class Human extends Creature {

    public Human(int maxDistance, int maxHeight, String name, boolean inGame) {
        super(maxDistance, maxHeight, name, inGame);
    }

    @Override
    public void celebrate() {
        System.out.println("Ура! " + super.getName() + " победил!");
    }
}
