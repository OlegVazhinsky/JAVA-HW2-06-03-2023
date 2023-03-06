package org.example;

public class Robot extends Creature {

    public Robot(int maxDistance, int maxHeight, String name, boolean inGame) {
        super(maxDistance, maxHeight, name, inGame);
    }

    @Override
    public void celebrate() {
        System.out.println("Бип-бип! " + super.getName() + " победил!");
    }
}
