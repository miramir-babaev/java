package view;

import toys.toy;
import shop.ballshop;
import shop.dollshop;
import shop.robotshop;
import shop.toyshop;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class priorityqueue {

    public void startApplication() {
        Queue<toy> toyQueue = new PriorityQueue<>((t1, t2) -> t2.getWeight() - t1.getWeight());

        toyshop ballshop = new ballshop();
        toyshop robotshop = new robotshop();
        toyshop dollshop = new dollshop();

        toyQueue.add(ballshop.createToy(1, 1, "мяч"));
        toyQueue.add(robotshop.createToy(2, 3, "робот"));
        toyQueue.add(dollshop.createToy(3, 2, "кукла"));

        Random random = new Random();
        try {
            FileWriter writer = new FileWriter("result.txt", StandardCharsets.UTF_8);
            for (int i = 0; i < 10; i++) {
                int randomValue = random.nextInt(10) + 1;
                toy toy;
                if (randomValue <= 2) {
                    toy = ballshop.createToy(1, 1, "мяч");
                } else if (randomValue <= 4) {
                    toy = robotshop.createToy(2, 3, "робот");
                } else {
                    toy = dollshop.createToy(3, 2, "кукла");
                }
                String result = "ID: " + toy.getId() + ", Вес: " + toy.getWeight() + ", Название: " + toy.getName() + "\n";
                writer.write(result);
            }
            writer.close();
            System.out.println("Результаты записались в файл result.txt");
        } catch (IOException e) {
            System.out.println("Произошла ошибка!");
            e.printStackTrace();
        }
    
    }
}


