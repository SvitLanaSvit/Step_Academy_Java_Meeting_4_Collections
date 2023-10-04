package org.example.request;

public class Request {
    private String user;
    private long timestamp;

    public Request(String user) {
        this.user = user;
        this.timestamp = System.currentTimeMillis();
    }

    public String getUser() {
        return user;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
