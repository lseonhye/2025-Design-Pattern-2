package org.example.designpattern2.observer.ex.stock;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscrbe(Observer observer);
    void notifyObservers();
}
