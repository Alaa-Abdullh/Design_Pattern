package com;

public interface BookObserver {
    void update(Book book, User user, String action);
}

public class NotificationService implements BookObserver {
    @Override
    public void update(Book book, User user, String action) {
    }
}