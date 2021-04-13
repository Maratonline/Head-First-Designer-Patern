package main.chapters.two.station;

import java.util.Random;

public class WeatherStation {
    public int getTempreature(){
        return new Random().nextInt();
    }
    public int getHumidity(){
        return 500;
    }
}
