package main.chapters.three.topings;

import main.chapters.three.Bevarage;

public class Chocolate extends Toping {
    Bevarage bevarage;

    public Chocolate(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDesription() {
        return bevarage.getDesription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return bevarage.cost() + 0.5;
    }
}
