package main.chapters.two;

import main.chapters.two.station.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class TempretarDisplay implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The tempreatare is:" + ((WeatherData) o).getLastTempreature());
    }
}
