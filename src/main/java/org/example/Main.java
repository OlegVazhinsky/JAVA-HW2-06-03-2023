package org.example;

import java.util.ArrayList;
import java.util.Random;

/*
1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса. Эти классы должны уметь бегать и прыгать,
все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
 */

public class Main {
    public static void main(String[] args) {

        int myRand;
        ArrayList<Obstacle> obstacles = new ArrayList<>();

        int obstacleSize = 10;
        Random rnd = new Random();
        for (int i = 0; i < obstacleSize; i++){
            myRand = rnd.nextInt(0,2);
            if (myRand == 0){
                obstacles.add(new Obstacle("Дорога", rnd.nextInt(1,100)));
            }
            else{
                obstacles.add(new Obstacle("Стена", rnd.nextInt(1,5)));
            }
        }

        ArrayList<Creature> participants = new ArrayList<>();

        int participantsSize = 10;
        for (int i = 0; i < participantsSize; i++){
            myRand = rnd.nextInt(0,4);
            if (myRand == 0){
                participants.add(new Human(rnd.nextInt(10,20), rnd.nextInt(1,3), "Человек " + i, true));
            }
            else if (myRand == 1){
                participants.add(new Cat(rnd.nextInt(10,20), rnd.nextInt(1,4), "Кот " + i, true));
            }
            else {
                participants.add(new Robot(rnd.nextInt(50,100), rnd.nextInt(1,5), "Робот " + i, true));
            }
        }

        for (int i = 0; i < obstacleSize; i++){
            System.out.println("____________________________________________");
            System.out.println("Препятствие " + obstacles.get(i).getType() + ", значение " + obstacles.get(i).getObstacleValue());
            for (int j = 0; j < participantsSize; j++){
                if (participants.get(j).isInGame()) {
                    if (obstacles.get(i).getType().equals("Дорога")){
                        participants.get(j).run(obstacles.get(i));
                    }
                    else {
                        participants.get(j).jump(obstacles.get(i));
                    }
                }
            }
        }

        System.out.println("____________________________________________");
        System.out.println("Трассу прошли:");
        for (int i = 0; i < participantsSize; i++){
            if(participants.get(i).isInGame()){
                participants.get(i).celebrate();
            }
        }

    }
}