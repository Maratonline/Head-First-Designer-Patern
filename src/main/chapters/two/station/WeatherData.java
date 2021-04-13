package main.chapters.two.station;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;

public class WeatherData extends Observable implements IWeatherData  {

    LinkedList<Integer> humidityList = new LinkedList<>();
    LinkedList<Integer> tempreatureList = new LinkedList<>();


    @Override
    public void addObservable(Observer observer) {
        addObserver(observer);
    }

    @Override
    public void removeObservable(Observer observer) {
        deleteObserver(observer);
    }

    @Override
    public void notifyObserver() {
        setChanged();
        notifyObservers();
    }


    public int getLastTempreature(){
        if (tempreatureList.size()>0)
        return tempreatureList.getLast();
        else return 0;
    }
    public int getLastHumidity(){
        if (humidityList.size()>0)
        return humidityList.getLast();
        else return 0;
    }
    public void setTempreature(int tempreature){
        tempreatureList.add(tempreature);
        notifyObserver();
    }
    public void setHumidity(int humidity){
        humidityList.add(humidity);
        notifyObserver();
    }

}
