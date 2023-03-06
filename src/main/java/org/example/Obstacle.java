package org.example;

public class Obstacle {
    String type;
    int obstacleValue;

    public Obstacle() {
    }

    /**
     *
     * @param type - может принимать значения "Дорога" или "Стена"
     * @param obstacleValue - принимает значение препятствия в метрах
     */
    public Obstacle(String type, int obstacleValue) {
        this.type = type;
        this.obstacleValue = obstacleValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getObstacleValue() {
        return obstacleValue;
    }

    public void setObstacleValue(int obstacleValue) {
        this.obstacleValue = obstacleValue;
    }
}
