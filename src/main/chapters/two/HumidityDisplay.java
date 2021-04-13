package main.chapters.two;

import main.chapters.two.station.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class HumidityDisplay implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The humidity is:" + ((WeatherData) o).getLastHumidity());
    }
}
