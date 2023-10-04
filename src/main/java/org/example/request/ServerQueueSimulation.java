package org.example.request;

import java.util.Queue;

public class ServerQueueSimulation {
    public static void simulateClientRequests(Queue<Request> requestQueue) {
        int numRequests = (int) (Math.random() * 5); // Simulate 0-4 requests per second
        for (int i = 0; i < numRequests; i++) {
            String user = "User" + (int) (Math.random() * 10);
            Request request = new Request(user);
            requestQueue.offer(request);
            System.out.println("Request from " + user + " added to the queue.");
        }
    }

    public static void processRequests(Queue<Request> requestQueue, Queue<Request> requestStatistics) {
        Request request = requestQueue.poll();
        if (request != null) {
            System.out.println("Request from " + request.getUser() + " processed.");
        }
        requestStatistics.offer(request);
    }

    public static void displayRequestStatistics(Queue<Request> requestStatistics) {
        System.out.println("Request Statistics:");
        for (var request : requestStatistics) {
            if(request != null)
                System.out.println("User: " + request.getUser() + ", Arrival Time: " + request.getTimestamp());
        }
        System.out.println("-----------------------------");
    }
}
