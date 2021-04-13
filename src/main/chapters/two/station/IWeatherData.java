package main.chapters.two.station;

import java.util.Observer;

public interface IWeatherData {
    void addObservable(Observer observer);
    void removeObservable(Observer observer);
    void notifyObserver();
}
