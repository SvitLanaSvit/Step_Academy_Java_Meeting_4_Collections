package org.example.request;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        //Завдання 3:
        //Розробити додаток, що імітує чергу запитів до сервера. Повинні бути клієнти, що надсилають запит на
        //сервер, у кожного з яких є свій пріоритет. Кожен новий клієнт попадає в чергу в залежності від свого
        //пріоритету. Необхідно зберігати статистику запитів (користувач, час) в окремій черзі.
        Queue<Request> requestQueue = new PriorityQueue<>(Comparator.comparingLong(Request::getTimestamp));
        Queue<Request> requestStatistics = new LinkedList<>();
        long lastSimulationTime = System.currentTimeMillis();

        do {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastSimulationTime >= 10) {
                ServerQueueSimulation.simulateClientRequests(requestQueue);
                lastSimulationTime = currentTime;
            }

            ServerQueueSimulation.processRequests(requestQueue, requestStatistics);
            ServerQueueSimulation.displayRequestStatistics(requestStatistics);
        } while (true);

    }
}
