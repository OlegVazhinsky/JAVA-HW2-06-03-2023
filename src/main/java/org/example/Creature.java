package org.example;

public class Creature implements Moveable {
    private int maxDistance;
    private int maxHeight;
    private String name;
    private boolean inGame;

    public Creature(int maxDistance, int maxHeight, String name, Boolean inGame) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = name;
        this.inGame = inGame;
    }

    @Override
    public void run(Obstacle obstacle) {
        if (obstacle.getObstacleValue() <= this.maxDistance) {
            System.out.println(this.name + ": пробежал через препятствие " + obstacle.getType() + " длиной "
                    + obstacle.getObstacleValue() + " м.");
        } else {
            System.out.println(this.name + ": не пробежал через препятствие длиной " + obstacle.getType()
                    + " длиной " + obstacle.getObstacleValue() +
                    " м. (максимальная дистанция " + this.name + " " + this.maxDistance + " м.");
            this.setInGame(false);
        }
    }

    @Override
    public void jump(Obstacle obstacle) {
        if (obstacle.getObstacleValue() <= this.maxDistance) {
            System.out.println(this.name + ": перепрыгнул через препятствие " + obstacle.getType() + " высотой "
                    + obstacle.getObstacleValue() + " м.");
        } else {
            System.out.println(this.name + ": не перепрыгнул через препятствие " + obstacle.getType()
                    + " высотой " + obstacle.getObstacleValue() +
                    " м. (максимальная высота " + this.name + " " + this.maxDistance + " м.");
            this.setInGame(false);
        }
    }

    @Override
    public void celebrate() {
        System.out.println("Ура! " + this.name + " победил!");
    }

    public String getName() {
        return name;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
}
