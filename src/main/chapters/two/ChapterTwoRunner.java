package main.chapters.two;

import main.ChapterRunner;
import main.chapters.two.station.WeatherData;
import main.chapters.two.station.WeatherStation;

public class ChapterTwoRunner implements ChapterRunner {
    @Override
    public void run() {
//        WeatherStation weatherStation = new WeatherStation();
//        WeatherData weatherData = new WeatherData();
//        weatherData.addObservable(new TempretarDisplay());
//        weatherData.addObservable(new HumidityDisplay());
//        weatherData.setTempreature(weatherStation.getTempreature());
//        weatherData.setHumidity(weatherStation.getHumidity());
        new SwingObserverExample().go();
    }
}
